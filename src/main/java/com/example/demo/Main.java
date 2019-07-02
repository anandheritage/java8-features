package com.example.demo;

public class Main implements Left,Right{
    public void run(){
        System.out.println("Main");
        Left.super.run();
    }
    public static void main(String srgs[]){
        Main main   = new Main();
        main.run();
    }
}
