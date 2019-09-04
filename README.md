To change swagger path for UI, look at:

C:\Users\Sergei_Doroshenko\IdeaProjects\rest-examples\swagger-ui-new\src\main\resources\META-INF\resources\swagger-ui\index.html
```
url: "http://localhost:8081/webapi/swagger.json"
```

To change base api path for make calls from Swagger UI look at:
C:\Users\Sergei_Doroshenko\IdeaProjects\rest-examples\jersey-rest-webapp\src\main\webapp\WEB-INF\web.xml
```
<param-value>http://localhost:8081/webapi</param-value>
```