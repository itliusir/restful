package com.itliusir.restful.service;

import com.itliusir.restful.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import javax.ws.rs.*;

/**
 * JAX-RS提供注解
 *
 * @author itliusir
 * @see
 * @since 2017-10-15
 */

@Configuration
@Component
@Path("/jaxRs")
@Produces("application/json")
public class JaxRsService{

    @Autowired
    @Qualifier("currentUser")
    private User user;

    @GET
    @Path("/json/user")
    @Produces("application/json")
    public User user() {
        return user;
    }

    //setName
    @PUT
    @Path("/json/username/set/{name}")
    @Produces("application/json")
    public User setUserName(@PathParam("name") String name) {
        user.setName(name);
        return user;
    }

    //setAge
    @PUT
    @Path("/json/userage/set/{age}")
    @Produces("application/json")
    public User setUserAge(@PathParam("age") String age) {
        user.setAge(age);
        return user;
    }
}
