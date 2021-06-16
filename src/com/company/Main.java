package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "Hello!"; // pay attention to naming, it mustn't be 1 letter
        String b = new String("Help"); // this variable must be the same - "Hello!". Try with it and see the result 
        String c = a.intern();

        System.out.println(a == b);
        System.out.println(a == c);


    }
}
