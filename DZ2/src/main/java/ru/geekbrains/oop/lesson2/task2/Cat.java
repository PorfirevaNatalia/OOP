package ru.geekbrains.oop.lesson2.task2;

public class Cat extends BaseCat implements Runnable{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        this.name = name;
        this.color = color;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void run(){
        System.out.println("Котик бежит");
    }

}
