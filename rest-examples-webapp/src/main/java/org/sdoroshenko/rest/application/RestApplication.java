package org.sdoroshenko.rest.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.sdoroshenko.rest.MessageResource;

public class RestApplication extends ResourceConfig {

    public RestApplication() {
        register(RequestContextFilter.class);
        register(MessageResource.class);

        packages("io.swagger.jaxrs.listing",
                "io.swagger.sample.resource",
                "io.swagger.api");
    }
}