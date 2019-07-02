package com.example.demo;

public interface Left {
    default void run(){
        System.out.println("Left");
        String a = "Left";
        a = "Right";
        System.out.println("not final" + a);
    }
}
