#!/bin/sh

cat new.json|sed -e 's/localhost:1234/localhost/g' > p1.json
cat p1.json|sed -e 's/\\\/wp-json//g' > p2.json
cat p2.json|sed -e 's/"basePath":""/"basePath":"\\\/wp-json"/g' > p3.json
cat p3.json|tr '\n' '~'|sed -e s'/\"enum\":\[\~ *\"\"\~ *\]\~//g'|tr '~' '\n' > p4.json
cat p4.json |grep -v \"\", > swagger.json
rm p1.json p2.json p3.json p4.json