package com.revature.customer;

import java.util.Random;

public class Customer {
    private String name;
    private int num;

    static int totalCount = 0;
    static final int ID_BOUND = 10000;
    private static final Random ID_Generator = new Random(12345L);

    public Customer() {
        this.name = null;
        this.num = ID_Generator.nextInt(ID_BOUND);
        totalCount++;
    }

    public Customer(String name){
        this.name = name;
        this.num = ID_Generator.nextInt(ID_BOUND);
        totalCount++;
    }

    public Customer(String name, int num){
        this.name = name;
        this.num = num;
        totalCount++;
    }

    public void set(String name) {
        this.name = name;
    }

    public void set(int number) {
        this.num = number;
    }

    public void set(String name, int number) {
        this.name = name;
        this.num = number;
    }

    public String getName(){
        return this.name;
    }

    public int getNum() {
        return this.num;
    }

    public void overloaded(String ...args) {
        StringBuilder newName = new StringBuilder(this.name);
        for (String arg : args) {
            newName.append(arg);
        }
        this.name = newName.toString();
    }

    public void overloaded(int ...args) {
        for (int arg : args) {
            this.num += arg;
        }
    }

    public String toString() {
        return this.name + "#" + this.num;
    }
}
