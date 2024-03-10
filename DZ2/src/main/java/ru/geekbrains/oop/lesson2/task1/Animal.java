package ru.geekbrains.oop.lesson2.task1;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void voice();

    public abstract void jump();

    /*public void voice(){
        System.out.println("Животное подает голос");
    }

    public void jump(){
        System.out.println("Животное прыгает");
    }*/

}
