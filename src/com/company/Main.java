package com.company;

public class Main {

    public static void main(String[] args) {

        String str1 = "Hello!";
        String str2 = new String("Hello!"); //same to str1
        String str3 = str1.intern();

        //compares
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);


    }
}
