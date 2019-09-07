####Create Jersey project
To create Jersey project from scratch, execute this commands:
* for grizzly based project
```
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-grizzly2 \
-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
-DgroupId=org.sdoroshenko -DartifactId=simple-service -Dpackage=org.sdoroshenko.rest \
-DarchetypeVersion=2.21.1
```
* for webapp project
```
mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp \
-DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false \
-DgroupId=org.sdoroshenko -DartifactId=simple-service-webapp -Dpackage=org.sdoroshenko.rest \
-DarchetypeVersion=2.21.1
```
####Run a project
If run via Tomcat runner IDEA plugin, look application at:
```
http://localhost:8080/jersey-rest-webapp/webapi/myresource
```
If running via maven jetty plugin, execute:
```
mvn jetty:run
```
and then look for application at:
```
http://localhost:8080/webapi/myresource
```
####Swagger
swagger json:
```
http://localhost:8080/webapi/swagger.json
```
swagger UI:
```
http://localhost:8080/webapi/docs
```