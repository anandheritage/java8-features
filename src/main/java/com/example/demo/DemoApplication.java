package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication{
	public static void main(String[] args) {
		ApplicationContext appContext = SpringApplication.run(UserInfo.class, args);
		UserDb userDb = appContext.getBean("getUserDb",UserDb.class);
		UserDb userDb1 = appContext.getBean("getUserDb",UserDb.class);
		userDb.user.setName("Anand");
		System.out.println(userDb1.user.getName());
//		System.out.println(User.class);
//		String name = "exmkm";
//		Optional<String> stringOptional = Optional.ofNullable(name);
//		System.out.println(stringOptional.orElse("Anand"));
//        String ans = "ans";
////        int n = (a) -> a.length();
//        FInterface i = (s) -> s.length();
//        System.out.println(i.run("Anand"));
    }

}
