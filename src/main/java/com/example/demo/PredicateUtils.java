package com.example.demo;

import java.util.List;
import java.util.function.Predicate;

public class PredicateUtils {
    public static void main(String args[]){
        int[] l =  {1,2,3,4,11,12,12};
        Predicate<Integer> p1 =  x -> x > 10;
        Predicate<Integer> p2 =  x -> x % 2 == 0;
        PredicateUtils utils = new PredicateUtils();
        utils.m1(p2.and(p1),l);
    }
    public static void m1(Predicate<Integer> p,int[] l){
        for(int j : l){
            if(p.test(j)){
                System.out.println(j+"\n");
            }
        }
    }
}
