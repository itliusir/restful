package com.itliusir.restful.controller;

import com.itliusir.restful.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import static org.springframework.hateoas.core.DummyInvocationUtils.methodOn;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

/**
 * SpringMVC注解
 *
 * @author itliusir
 * @see
 * @since 2017-10-15
 */
@Service
@RestController
@RequestMapping("/user")
public class SpringMvcController {

    @Bean
    public User currentUser(){
        User user = new User();
        user.setName("itliusir");
        user.setAge("18");

        return user;
    }

    @Autowired
    @Qualifier("currentUser")
    private User user;

    //hateoas
    @GetMapping(path = "/json/user",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User user() {
        user.add(linkTo(methodOn(SpringMvcController.class).setUserName(user.getName())).withSelfRel());
        user.add(linkTo(methodOn(SpringMvcController.class).setUserAge(user.getAge())).withSelfRel());
        return user;
    }

    //setName
    @PutMapping(path = "/json/username/set/{name}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User setUserName(@PathVariable String name) {
        user.setName(name);
        return user;

    }

    //setAge
    @PutMapping(path = "/json/userage/set/{age}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User setUserAge(@PathVariable String age) {
        user.setAge(age);
        return user;

    }

}
