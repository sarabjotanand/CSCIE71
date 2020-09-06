package com.example.helloworld;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = user_input.next();
        System.out.println("Hello, "+ name +"!");
    }
}
