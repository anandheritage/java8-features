package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String args[]){
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(4);
        arr.add(6);
        arr.add(9);
       // List<Integer> result = arr.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
        List<String> result = arr.stream().map(i -> i.toString()+",\n").collect(Collectors.toList());
        for(String i : result){
            System.out.println(i);
        }
    }
}
