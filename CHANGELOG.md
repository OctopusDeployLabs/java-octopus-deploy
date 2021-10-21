# Octopus Java SDK Changelog

## VERSION 0.0.3-SNAPSHOT
###Features Added:

###Bugs Resolves:

###Known Issues:


## VERSION 0.0.2
###Features Added:
* Implemented Repository pattern over models and 'Api' classes
* Added examples module
* Renamed packges to remove pluralisation where possible
* Provide better exception types when server reqeusts fail

###Bugs Resolves:
 
###Known Issues:

## VERSION 0.0.1
###Features Added:
* Initial Release
** Create build system
** Configure automated github CI operations
** Autogen model types from openapi spec (with manual modifications)
* Connect to Octopus Server using HTTP (via proxy if needed)
* Perform CRUD operations on
** Spaces
** Projects
** Users
** Api Keys
** Releases
** Deployments
** BuildInformation
** Environments
* Push packages to server
* Prototype ExecutionAPI
* Provide test-support module to support clients testing against a real octopus-server
** Used internally for Acceptance-Tests
* Log appender such that clients can 'hook' sdk logged data

###Bugs Resolves:

###Known Issues:


