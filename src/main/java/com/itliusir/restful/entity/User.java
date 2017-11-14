package com.itliusir.restful.entity;

import org.springframework.hateoas.ResourceSupport;

/**
 * TODO
 *
 * @author itliusir
 * @see
 * @since 2017-10-15
 */
public class User extends ResourceSupport {

    private String name;

    private String age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
