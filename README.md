# octopus-java-sdk
A wrapper to the Octopus Server's HTTP API to allow creation of java clients

It uses a gradle build syste

It uses gradle (via the gradle wrapper) to produce the requisite jar files.

The unit tests are run in github actions and artefacts are produced by the Octopus TeamCity
instance, and published to the internal maven repo (part of Octopus Artifactory).

# Version Management
The version is stored in the gradle.properties file, but TeamCity uses GitVersion to determine
actual version (ignoring gradle.properties).

Versioning follows a standard SemVer convention.

# Lifecycle
At initial commit, this SDK only supported a small subset of the Octopus Server SDK,
and the goal is to grow this over time.

It was hoped that the OpenApiGenerator tool would be able to auto-generate much of the
API code form the Octopus Server's `swagger.json` file, however the autocoding cannot
account for things such as hierarchy and templating - i.e. the json represents the 
data which traverses the link - it does not define how to best represent this data
in various languages - thus the API is required to be (somewhat) hand-crafted.

## Api Generation Process
There are three parts of the API, none of whichi can be fully auto-generated:
1. Models - which are the data structures which traverse the client-server link
1. Client - which is responsible for serialising data structs, wrapping them in a HttpRequest, 
sending it to the server, then handling the response.
1. Hyper-media traversal - Octopus uses hypermedia links in all of its responses (under `links`
   field in a response). This defines the path under which specific sub-items can be found on the
   server.
   
### Models Creation
Executing `./gradlew openapigenerate` populates a standard java source tree under
`octopus-openapi-wrapper/build/generated`.

This generation includes all models, and api classes - of which the latter may be ignored.

In order to use a generated model class in the SDK, the following must be performed:
1. Copy the required model into an appropriate package under the `octopus-sdk` module.
1. Force the model to extend either `BaseNamedResource` or `BaseResource` (if the resource 
   contains a `name` field or not).
1. Remove `name`, `id` and `links` fields from the copied model (as they exist in the base class) - 
   and remove all references to said fields (such that the class is compileable).
1. Create a <resource>WithLinks class 'next to' the copied model, which inherits from the model.
1. In a terminal run `./tools/create_links_json.schema.sh <url>` where <url> points to a running 
   OctopusDeploy server, with a path which contains a json-representation of the resource in question.
1. Copy the output from the previous step into the <resource>WithLinks class.

## Client Creation
The OctopusClient class contains the low-level HTTP code required to handle communications with the
server, it should not require alteration when adding new models/paths to the API.

## Hypermedia Management - API Creation
The hypermedia linkages are largely hidden from the client-developer (and completely obfuscated from
the SDK customer).

Each new model added to the SDK requires a matching "API" class, which allows CRUD operations to be
performed on said model (as well as pagination of lists of results).

However, the following concepts should be recognised:
1. Pagination of results & CRUD operations are handled in the 
   `BaseResourceApi`/`BaseNamedResourceAPi`
1. For each Model created, you are required to also provide a "PaginatedCollection" of the model
   (not sure what to do if the result cannot be paginated)
1. Extend either `BaseResourceApi` or `BasedNamedApi` (or `SymmetricApi`), and set the generic 
   classes with concrete classes which represent the model added. MOSTLY the request/response 
   types are the same - but sometimes (eg BuildInformation), they are not.   

Each API class should offer a static "Create" function which ensures the hypermedia linkage is
handled - and that any prequisites are fulfilled - all pre-reqs should be passed as params to this
function, and the constructor should be private/protected to prevent usage.

Eg. ProjectApi::create takes not only the client required to send data, but also the SpaceHome which
represents the containing Space.

No CRUD operations _should_ be required to be implemented in the child API class, as these are 
implemented in the parent `BaseResourceApi` - however, there are times a function is required to be
overrided (eg BuildInfo::create needs to acdept an overwriteMode queryparam) - and the default
`create` operation is stubbed out as 'unsupported'
