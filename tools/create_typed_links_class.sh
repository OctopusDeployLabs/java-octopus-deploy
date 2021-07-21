#!/bin/sh
API_KEY=API-D62EQ9I4EVET1E2LJUBKEHLNBYWMO3
ROOT_PATH='http://localhost:8066/api/'
INPUT=$1

writeClassHeader() {
echo "

package com.octopus.sdk.model.links;

import java.util.Map;


public class $1  extends BaseTypedLInks { 

  public $1(final Map<String, String> rawLinks) {
    super(rawLinks);
  }"
}

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
    VARNAME=`echo $i | sed s/\"//g | sed s/\\\\.//g`
    #echo "  public String get${VARNAME}Link() { return getCleansedRawLink($i); }"
    echo "  public String get${VARNAME}Link() { return LinkHelpers.getCleansedRawLink(getLinks().get($i)); }"
  done
}

echo We are fetching $ROOT_PATH$INPUT
CONTENT=`curl -s --header """X-Octopus-ApiKey: $API_KEY""" --header """Content-Type: application/json""" -X GET $ROOT_PATH$INPUT`

#LINKS_CONTENT=`echo $CONTENT | jq '.Links'`
LINKS_CONTENT=`cat | jq '.'`
createClassFromLinksBLock $INPUT "$LINKS_CONTENT"

#SUB_LINKS=`echo $CONTENT | jq '.Items[0].Links'`
#SUB_LINK_CLASS_NAME=${INPUT}Item
#createClassFromLinksBLock "$SUB_LINK_CLASS_NAME" "$SUB_LINKS"
