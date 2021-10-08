#!/bin/sh

#Show debug output
#set -eux

API_KEY=API-WPYFOZLIEBKZT08TRCV84LZMNJ29JC85
ROOT_PATH='http://localhost:8066/api/'
INPUT=$1

writeClassHeader() {
echo "

package com.octopus.sdk.model.links;

import java.util.Map;


public class ResourceWithLinks extends Resource { 

  public ResourceWithLinks(final Map<String, String> rawLinks) {
    super(rawLinks);
  }"
}

createClassFromLinksBlock() {
  LINK_NAMES=$1
  writeClassHeader
  wrapStringInFunc $LINK_NAMES
  echo "}"
}


wrapStringInFunc() {
  for i in $@
  do
    VARNAME=`echo $i | sed s/\"//g | sed s/\\\\.//g`
    #echo "  public String get${VARNAME}Link() { return getCleansedRawLink($i); }"
    echo "  public String get${VARNAME}Link() { return getCleansedLink($i); }"
  done
}

#echo We are fetching $INPUT
CONTENT=`curl -s --header """X-Octopus-ApiKey: $API_KEY""" --header """Content-Type: application/json""" -X GET $INPUT`
#echo $CONTENT
LINKS_CONTENT=`echo $CONTENT | tr '\r\n' ' '| jq '.Links' | jq 'keys | .[]'`
createClassFromLinksBlock  "$LINKS_CONTENT"
