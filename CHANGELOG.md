# Octopus Java SDK Changelog

## VERSION 0.0.4-SNAPSHOT
### Features Added:
* Hascode and Object.equals functions now factor in all parameters of parent class (not just local members)

### Bugs Resolved:
* N/A

### Known Issues:
* N/A

## VERSION 0.0.3
### Features Added:
* N/A

### Bugs Resolved:
* Updated Log4J dependency to mitigate Dec 2021 RCE 0-Day exploit

### Known Issues:
* N/A

## VERSION 0.0.2
###Features Added:
* Implemented Repository pattern over models and 'Api' classes
* Added examples module
* Renamed packages to remove pluralisation where possible
* Provide better exception types when server requests fail
* Added 'getByIdOrName' for each resource type
* Added CRUD operations for:
  * Channels
  * Lifecycles 
  * Runbooks 
  * Tenants 
  * Tagsets
  * Tasks

### Bugs Resolved:
* N/A

### Known Issues:
* N/A

## VERSION 0.0.1
### Features Added:
* Initial Release
  * Create build system
  * Configure automated github CI operations
  * Autogen model types from openapi spec (with manual modifications)
* Connect to Octopus Server using HTTP (via proxy if needed)
* Perform CRUD operations on
  * Spaces
  * Projects
  * ProjectGroup
  * Users
  * Api Keys
  * Releases
  * Deployments
  * BuildInformation
  * Environments
  * Packages
* Push packages to server
* Prototype ExecutionAPI
* Provide test-support module to support clients testing against a real octopus-server
** Used internally for Acceptance-Tests
* Log appender such that clients can 'hook' sdk logged data

### Bugs Resolved:
* N/A

### Known Issues:
* N/A

