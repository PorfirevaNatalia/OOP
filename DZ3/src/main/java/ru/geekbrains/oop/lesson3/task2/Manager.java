package ru.geekbrains.oop.lesson3.task2;

public class Manager extends Employee{
    private Manager(String position, String surName, String name, int age, double salary) {
        super(position, surName, name, age, salary);
    }

    public static Manager create(String position, String surName, String name, int age, double salary){
        return new Manager(position, surName, name, age, salary);
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
