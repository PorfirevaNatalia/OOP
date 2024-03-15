package ru.geekbrains.oop.lesson3.task2;

public class Staff extends Employee{

    public Staff(String position, String surName, String name, int age, double salary) {
        super(position, surName, name, age, salary);
        
    }

    public static Staff create(String position,String surName, String name, int age, double salary){
        return new Staff(position, surName, name, age, salary);
    }

    @Override
    public double calculateSalary() {
       return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s; возраст: %d; ставка: %.2f руб.; заработная плата: %.2f руб.",
            position, surName, name, age, salary, calculateSalary());
    }
    
}
