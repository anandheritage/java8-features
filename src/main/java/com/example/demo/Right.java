package com.example.demo;

public interface Right {
    default void run(){
        System.out.println("Left");
    }
}
