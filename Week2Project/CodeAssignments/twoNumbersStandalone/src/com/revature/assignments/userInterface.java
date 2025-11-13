package com.revature.assignments;

import java.util.Scanner;

public class userInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("\nSum: " + mathOnNumbers.sum(num1, num2));
        System.out.println("Difference: " + mathOnNumbers.diff(num1, num2));
        System.out.println("Product: " + mathOnNumbers.product(num1, num2));
        System.out.println("Quotient: " + mathOnNumbers.quotient(num1, num2));
    }
}
