package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        System.out.println("Please enter a four digit pin to create a new account");
        Scanner scanner = new Scanner(System.in);
        try {
            String input = scanner.nextLine();
            if (input.length() == 4) {
                System.out.println("Please re-verify PIN");
                String verifyPIN = scanner.nextLine();
                if (input.equals(verifyPIN)) {
                    System.out.println("PIN is now set as " + input);

                } else {
                    System.out.println("verification failed. Please try again.");
                }
            } else {
                System.out.println("Wrong enter new PIN");
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex);
        }
    }
}
// Create new pin
// create new customer