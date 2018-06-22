package com.service.testmic001.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-06-22T02:14:37.456Z")

@RestSchema(schemaId = "testmic001")
@RequestMapping(path = "/testmic001", produces = MediaType.APPLICATION_JSON)
public class Testmic001Impl {

    @Autowired
    private Testmic001Delegate userTestmic001Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTestmic001Delegate.helloworld(name);
    }

}
