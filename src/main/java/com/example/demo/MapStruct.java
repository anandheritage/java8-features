package com.example.demo;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

public class MapStruct {
    public static void main(String args[]){
        ApplicationContext appContext = SpringApplication.run(convert.class, args);
        UserP userP = new UserP();
        userP.setId("s");
        userP.setName("Amamd ");
        userP.kids = 9;
        UserQ user = Mappers.getMapper(convert.class).converting(userP);
        System.out.println(user.getNaam());
        System.out.println(user.getCode());
        System.out.println(user.kids);
    }
}
