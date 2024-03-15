package ru.geekbrains.oop.lesson3.homework2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount){

        return true;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
