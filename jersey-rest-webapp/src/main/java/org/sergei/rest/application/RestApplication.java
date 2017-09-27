package org.sergei.rest.application;

import com.wordnik.swagger.jaxrs.config.BeanConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.sergei.rest.MyResource;

public class RestApplication extends ResourceConfig {

    public RestApplication() {
        register(MyResource.class);

        /*register(com.wordnik.swagger.jersey.listing.ApiListingResourceJSON.class);
        register(com.wordnik.swagger.jersey.listing.JerseyApiDeclarationProvider.class);
        register(com.wordnik.swagger.jersey.listing.JerseyResourceListingProvider.class);*/

        /*packages("io.swagger.jaxrs.listing",
                "io.swagger.sample.resource",
                "io.swagger.api");*/

        packages("com.wordnik.swagger.jersey.listing");

        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setTitle("My test application");
        beanConfig.setVersion("1.0.2");
        beanConfig.setBasePath("http://localhost:8081/webapi");
//        beanConfig.setBasePath("webapi");
        beanConfig.setResourcePackage("org.sergei.rest");
        beanConfig.setScan(true);


    }
}
