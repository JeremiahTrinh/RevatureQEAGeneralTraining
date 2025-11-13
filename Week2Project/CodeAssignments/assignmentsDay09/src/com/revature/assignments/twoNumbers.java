package com.revature.assignments;
//

import java.util.Scanner;

public class twoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("\nSum: " + sum(num1, num2));
        System.out.println("Difference: " + diff(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.println("Quotient: " + quotient(num1, num2));
    }

    public static double sum(double ...args) {
        double result = 0.0;
        for (double num : args) {
            result += num;
        }
        return result;
    }

    public static double diff(double num, double ...args) {
        double result = num;
        for (double arg : args) {
            result -= arg;
        }
        return result;
    }

    public static double product(double ...args) {
        double result = 1.0;
        for (double arg: args) {
            result *= arg;
        }
        return result;
    }

    public static double quotient(double num, double ...args) {
        double result = num;
        for (double arg : args) {
            result /= arg;
        }
        return result;
    }
}