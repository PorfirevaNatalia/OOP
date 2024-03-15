package ru.geekbrains.oop.lesson3.homework2;

public class Cat {
    private String name;
    private int appetite;

    /**
     * Сытость
     */
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate plate)
    {
        if (plate.decreaseFood(appetite)){
            satiety = true;
        }
        else{
            satiety = false;
        }
    }
}
