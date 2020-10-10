package com.employee;

public class Main {

    public static void main(String[] args) {

//        variables -- temporary memory location
//        data types --  int, short, byte, float, double, long, boolean, char
//        access modifiers -- public, private, default, protected
//        Objects are stored in heap
//        Primitive data types are stored in stack

        Employee emp = new Employee();
        Employee emp1 = new Employee();

        emp.doSomething();
        emp1.display();


    }
}
