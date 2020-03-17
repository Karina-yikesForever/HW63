package com.company;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
Root luambda=((n, x) -> {
    Integer result =1;
    Integer num=x;
    for (int i=x;i>1;i--){
    for (int j = 0; j < n; j++) {
        result = result * i;
    }
        if (result == num) {
            return i;
        }
        result = 1;
    }
             return result;
});
         System.out.println(luambda.Roooot(4,81));
                 }
                 }


interface Factorial{
    Integer factor(Integer i);
}

interface Root{
    Integer Roooot(Integer n,Integer x);
    }