package com.jmas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hola Mon!!");

        String txt = " ";
        System.out.println(txt.isEmpty());

        System.out.println("1".repeat(3));
        txt = "Hola que tal\nJo molt be\ni tu?";
        txt.lines()
            .forEach(System.out::println);

    }
}
