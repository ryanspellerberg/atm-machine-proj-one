package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter a four digit pin to create a new account");
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            System.out.println(input);
        } catch (IllegalStateException ex) {
            System.out.println(ex);
        }
    }
}
// Create new pin
// create new customer