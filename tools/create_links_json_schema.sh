#!/bin/sh
API_KEY=API-D62EQ9I4EVET1E2LJUBKEHLNBYWMO3
#ROOT_PATH='http://localhost:8065/api/'
INPUT=$1

createClassFromLinksBLock() {
  CLASS_NAME=$1TypedLinks
  shift
  LINK_NAMES=`echo $1 | jq ' keys | .[]'`
  writeClassHeader $CLASS_NAME
  wrapStringInFunc $LINK_NAMES
  echo "}"
  echo ====================================
}


wrapStringInFunc() {
  for i in $@
  do
    echo $i: {\"type\": \"string\",
    echo "readonly": true
    echo "}"
  done
}

echo We are fetching $ROOT_PATH$INPUT
CONTENT=`curl -s --header """X-Octopus-ApiKey: $API_KEY""" --header """Content-Type: application/json""" -X GET $ROOT_PATH$INPUT`

LINKS_CONTENT=`echo $CONTENT | jq '.Links' | jq ' keys | .[]'`
#LINKS_CONTENT=`cat | jq '.'`
echo \"Links\":{
echo \"type\": \"object\",
echo \"properties\": {
wrapStringInFunc $LINKS_CONTENT
echo }
echo }

#SUB_LINKS=`echo $CONTENT | jq '.Items[0].Links'`
#SUB_LINK_CLASS_NAME=${INPUT}Item
#createClassFromLinksBLock "$SUB_LINK_CLASS_NAME" "$SUB_LINKS"
