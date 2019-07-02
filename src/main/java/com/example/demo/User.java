package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class User {
    private String name;

    public User(){
        System.out.println("Hi user is getting created");
    }
    public User(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDefaultName(String n){
        return n;
    }
}
