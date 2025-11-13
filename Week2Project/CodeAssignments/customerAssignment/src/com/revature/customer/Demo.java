package com.revature.customer;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String []names = new String[2];

        if (args.length == 2){
            names[0] = args[0];
            names[1] = args[1];
        }
        else {
            for (int i = 0; i < names.length; i++) {
                names[i] = getName();
            }
        }

        System.out.println("Customer.ID_BOUND = " + Customer.ID_BOUND);
        Customer customer1 = new Customer(names[0]);
        System.out.println("Customer.ID_BOUND = " + Customer.ID_BOUND);
        System.out.println("Customer.totalCount = " + Customer.totalCount);
        Customer customer2 = new Customer(names[1], 1234);
        System.out.println("Customer.ID_BOUND = " + Customer.ID_BOUND);
        System.out.println("Customer.totalCount = " + Customer.totalCount);
        print(customer1, customer2);

        customer1.set("Example");
        print(customer1);
        customer2.set(5678);
        print(customer2);
        customer2.set("Juice", 1234);
        print(customer2);

        customer1.overloaded(" ", "Last", "Name");
        customer1.overloaded(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        customer2.overloaded(customer1.getName());
        customer2.overloaded(customer2.getNum(), customer1.getNum());
        print(customer1, customer2);
    }

    private static String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        return scanner.nextLine();
    }

    private static void print(Customer ...args) {
        for (Customer arg : args) {
            System.out.println(arg.toString());
        }
    }
}
