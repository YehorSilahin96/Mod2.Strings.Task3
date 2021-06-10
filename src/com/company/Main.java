package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "Hello!";
        String b = new String("Help");
        String c = a.intern();

        System.out.println(a == b);
        System.out.println(a == c);


    }
}
