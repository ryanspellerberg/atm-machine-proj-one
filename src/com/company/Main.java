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
                verifyPIN(scanner, input);
            } else {
                System.out.println("Wrong enter new PIN");
            }
        } catch (IllegalStateException ex) {
            System.out.println(ex);
        }
    }

    private static void verifyPIN(Scanner scanner, String firstPIN) {
        System.out.println("Please re-verify PIN");
        String verifyPIN = scanner.nextLine();
        if (firstPIN.equals(verifyPIN)) {
            System.out.println("PIN is now set as " + firstPIN);

        } else {
            System.out.println("verification failed. Please try again.");
        }
    }
}
// Create new pin
// create new customer