/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eltonb.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author elton.ballhysa
 */

@Path("hello")
public class HelloService {

    @GET
    @Path("greeting")
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting() {
        return "Hello from Rest Service";
    }
    
    @GET
    @Path("hi")
    @Produces(MediaType.APPLICATION_JSON)
    public String hi() {
        return "{\"name\": \"Jane\", \"surname\": \"Doe\", \"age\": 21}";
    }
    
    @GET
    @Path("ckemi")
    @Produces(MediaType.APPLICATION_JSON)
    public Person albanianHi() {
        Person p = new Person();
        p.setName("John");
        p.setSurname("Doe");
        p.setAge(22);
        return p;
    }
    
    @POST
    @Path("shout")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Person shout(Person p1) {
        Person p2 = new Person();
        p2.setName(p1.getName().toUpperCase());
        p2.setSurname(p1.getSurname().toUpperCase());
        p2.setAge(p1.getAge());
        return p2;
        
    }
    
}
