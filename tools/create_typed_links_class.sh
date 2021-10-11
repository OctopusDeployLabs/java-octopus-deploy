#!/bin/sh

#Show debug output
#set -eux

while getopts u:a: flag
do
    case "${flag}" in
        u) url=${OPTARG};;
        a) api_key=${OPTARG};;
    esac
done

if [ -z "$url" ]
then
      printf "URL cannot be null or empty"
      exit 1
fi

if [ -z "$api_key" ]
then
    if [ -z "$OCTOPUS_SERVER_API_KEY" ]
    then
        printf "API key cannot be null or empty"
        exit 1
    else
        api_key="$OCTOPUS_SERVER_API_KEY"
    fi
fi


outputGetMethodText() {
  LINK_NAMES=$1
  printf -- "--------------------------------------------------\n\n"
  wrapStringInFunc $LINK_NAMES
  printf -- "--------------------------------------------------"
}


wrapStringInFunc() {
  for i in $@
  do
    VARNAME=`echo $i | sed s/\"//g | sed s/\\\\.//g`
    printf "public String get${VARNAME}Link() {\n  return getCleansedLink($i);\n}\n\n"
  done
}

#echo We are fetching $INPUT
CONTENT=`curl -s --header """X-Octopus-ApiKey: $api_key""" --header """Content-Type: application/json""" -X GET $url`
#echo $CONTENT
LINKS_CONTENT=`echo $CONTENT | tr '\r\n' ' '| jq '.Links' | jq 'keys | .[]'`
outputGetMethodText "$LINKS_CONTENT"
