package ru.geekbrains.oop.lesson1;

public class BagOfChips extends Product{

    private double weight;
    private String taste; // вкус

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
    public BagOfChips(String brand, String name, String taste, double price, double weight){
        super(brand, name, price);
        this.weight = weight;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("Пачка чипсов\n\t[Производитель: %s\n\tНаименование: %s\n\tВкус: %s\n\tСтоимость: %.2f\n\tВес: %.2f]",
                brand, name, taste, price, weight);
    }

    
}
