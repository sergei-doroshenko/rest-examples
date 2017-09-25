package org.sergei.rest.application;

import org.glassfish.jersey.server.ResourceConfig;
import org.sergei.rest.MyResource;

public class RestApplication extends ResourceConfig {

    public RestApplication() {
        register(MyResource.class);

        /*register(com.wordnik.swagger.jersey.listing.ApiListingResourceJSON.class);
        register(com.wordnik.swagger.jersey.listing.JerseyApiDeclarationProvider.class);
        register(com.wordnik.swagger.jersey.listing.JerseyResourceListingProvider.class);*/

        packages("io.swagger.jaxrs.listing",
                "io.swagger.sample.resource",
                "io.swagger.api");

    }
}
