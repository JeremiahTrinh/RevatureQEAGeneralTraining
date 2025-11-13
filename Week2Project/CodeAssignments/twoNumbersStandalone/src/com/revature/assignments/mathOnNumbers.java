package com.revature.assignments;

public class mathOnNumbers {
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
