package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

import javax.annotation.PostConstruct;
import java.util.Map;

@Configuration
public class UserInfo {

    @Value("#{systemProperties}")
    private Map<String, String> systemPropertiesMap;

    @Value("#{getUser.getDefaultName(naam1)}")
    protected String naam;

    @Bean
    public User getUser(){
        System.out.println("Creating a new user object");
        return new User();
    }
    @Bean
    public UserDb getUserDb(){
        System.out.println("Creating a new object");
        return new UserDb(getUser());
    }
    @PostConstruct
    public void hey(){
        System.out.println("Heyyyyyyy");
    }
    @PostConstruct
    public void init(){

        String naam1 = new String("KL");

        System.out.println("bejbjbj" + systemPropertiesMap);
        System.out.println(naam);
    }
}
