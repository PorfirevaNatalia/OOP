package ru.geekbrains.oop.lesson3.task2;

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int positionRes = position.compareTo(o.position);
        if (positionRes == 0){
            return surName.compareTo(o.surName);
        }
        return positionRes;
    }

    /**
     *Должность
     */
    protected String position;

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     *возраст
     */
    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    public Employee(String position, String surName, String name, int age, double salary) {
        this.position = position;
        this.surName = surName;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
