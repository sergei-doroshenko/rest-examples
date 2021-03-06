package org.sergei.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.sergei.rest.RestConstants.INCORRECT_PARAMS;
import static org.sergei.rest.RestConstants.INTERNAL_SERVER_ERROR;
import static org.sergei.rest.RestConstants.SUCCESSFUL_REQUEST;

/*import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;*/

/**
 * Root resource (exposed at "myresource" path)
 * http://localhost:8081/webapi/myresource
 */
@Path("myresource")
@Api(value = "TesResource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @ApiOperation(value = "Return test messge", httpMethod = "GET", response = Response.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = SUCCESSFUL_REQUEST),
        @ApiResponse(code = 400, message = INCORRECT_PARAMS),
        @ApiResponse(code = 500, message = INTERNAL_SERVER_ERROR)
    })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {
        return Response.ok("{\"message\":\"Got it!\"}").build();
    }
}
