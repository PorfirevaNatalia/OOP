package ru.geekbrains.oop.lesson1;

public class CandyBar extends Product {

    private double weight; // вес
    private String taste; // вкус
    private double calories; // калорийность

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public CandyBar(String brand, String name, String taste, double price, double weight, double calories) {
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
        this.calories = calories;
    }

    @Override
    public String displayInfo() {
        return String.format(
                "Батончик\n\t[Производитель: %s\n\tНаименование: %s\n\tВкус: %s\n\tСтоимость: %.2f\n\tВес: %.2f\n\tКалорийность(на 100 гр.): %.2f]",
                brand, name, taste, price, weight, calories);
    }

}
