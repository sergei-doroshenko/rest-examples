package org.sergei.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.sergei.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static org.sergei.rest.RestConstants.INCORRECT_PARAMS;
import static org.sergei.rest.RestConstants.INTERNAL_SERVER_ERROR;
import static org.sergei.rest.RestConstants.SUCCESSFUL_REQUEST;

/**
 * Root resource (exposed at "messages" path)
 * http://localhost:8081/webapi/messages
 */
@Path("messages")
@Api(value = "Message Resource")
public class MessageResource {

    @Autowired
    private MessageService messageService;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @ApiOperation(value = "Return json message", httpMethod = "GET", response = Response.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = SUCCESSFUL_REQUEST),
        @ApiResponse(code = 400, message = INCORRECT_PARAMS),
        @ApiResponse(code = 500, message = INTERNAL_SERVER_ERROR)
    })
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt() {
        String json = messageService.getMessage();
        return Response.ok(json).build();
    }
}
