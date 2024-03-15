package ru.geekbrains.oop.lesson3.task2;

import java.util.Arrays;

public class Program {

    public static void main(String[] args) {

        Staff[] staff = EmployeeFabric.generateEmployees(15);
        for (Staff personnel : staff) {
            System.out.println(personnel);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(staff);

        for (Staff personnel : staff) {
            System.out.println(personnel);
        }
    }

}
