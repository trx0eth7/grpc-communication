# Apps communication using gRPC  

## Overview
The example jvm-oriented apps communication based on the [gRPC](https://grpc.io)

Purpose:
* jmix to jmix communication
* jmix to cuba communication
* cuba to jmix communication
* cuba to cuba communication

## Developers
This is an installation guide for developers.

#### 1. Setting up jdk
Check that you are using jdk 11 (java -version)

#### 2. Setting up the database
Prepare database using docker-compose:
* `open deployment/postgresql`
* `check docker-compose.yml`
* `docker-compose up -d`

#### 3. Run applications
For jmix to jmix communication: run jmix-grpc-client and jmix-grpc-server applications