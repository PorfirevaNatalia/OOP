package ru.geekbrains.oop.lesson2.task2;

public class Dog extends BaseDog implements Runnable{

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("Собака бежит");
    }
}
