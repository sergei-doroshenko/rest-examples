package org.sdoroshenko.rest;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.sdoroshenko.model.Message;
import org.sdoroshenko.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Root resource (exposed at "messages" path)
 * http://localhost:8081/webapi/messages
 */
@Path("messages")
@Component
@Api(value = "Message Resource")
public class MessageResource {

    @Autowired
    private MessageService messageService;

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as a json response.
     */
    @GET
    @ApiOperation(value = "Return json message", httpMethod = "GET", response = List.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = RestConstants.SUCCESSFUL_REQUEST),
        @ApiResponse(code = 400, message = RestConstants.INCORRECT_PARAMS),
        @ApiResponse(code = 500, message = RestConstants.INTERNAL_SERVER_ERROR)
    })
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getMessages() {
        List<Message> messages = messageService.getAllMessages();
        return messages;
    }
}
