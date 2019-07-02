package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class UserDb {

    User user;

    public UserDb(User user){
        System.out.println("Creating a new user db\n");
        this.user = user;
    }
    public void printUser(){
        System.out.println(user.getName());
    }
}
