package com.example.demo;

import java.util.function.Function;

public class FunctionDemo {
    public  static void main(String args[]) {
        Function<Integer, Integer> f1 = l -> 2 * l;
        Function<Integer, Integer> f2 = l -> l + 1;

        int n = f1.apply(3);
        int k = f1.andThen(f2).apply(2);
        System.out.println(k);
    }

}
