<h1 align="center">Narcissistic Number</h1>

# How to run?

## install postgresql<br />

#### docker run --name postgresql-container -p 5432:5432 -e POSTGRES_PASSWORD=postgrespw -d postgres<br />

## install pgadmin4<br />

#### docker run --rm -p 5050:5050 thajeztah/pgadmin4 <br />

#### at src\main\resources\application.properties change the connection string to your postgresql<br />

#### Compile the code with maven install<br />

## Install app to docker tomcat<br />

#### docker build -t spring-postgre<br />

## Run the docker created image <br />

#### docker run -itd -p 8085:8080 spring-postgre<br />

#### Open<br />

#### http://localhost:8085/spring-postgre/customer<br />