#!/bin/bash

cd /usr/src/mymaven
mvn clean install -Dmaven.test.skip
cd ./target
java -jar -Dserver.port=9001 test-domain-name-0.0.1-SNAPSHOT.jar