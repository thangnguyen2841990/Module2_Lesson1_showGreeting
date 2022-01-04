package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = scanner.nextLine();
        System.out.println("Hello: "+ name);
    }
}
