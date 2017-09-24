package org.sergei.rest.swagger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by sergei on 24.9.17.
 */
@Path("docs")
public class SwaggerUIResource {

    @GET
    @Produces("text/html")
    public String getApiDocs() {
        return null;
    }
}
