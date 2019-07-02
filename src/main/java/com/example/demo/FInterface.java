package com.example.demo;



public interface FInterface {

    public int run(String st);

    default String getName(){
        return "Hey";
    }
}
