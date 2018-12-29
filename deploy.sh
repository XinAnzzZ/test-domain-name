#!/bin/bash

cd /docker/java-service/test-domain-name/test-domain-name
git pull -u origin master
cd /docker/java-service/test-domain-name
docker-compose restart