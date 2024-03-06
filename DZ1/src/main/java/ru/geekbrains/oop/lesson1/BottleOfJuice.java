package ru.geekbrains.oop.lesson1;

public class BottleOfJuice extends Product {
    
    private double volume;
    private String taste; // вкус

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }
    public BottleOfJuice(String brand, String name, String taste, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
        this.taste = taste;
    }

    @Override
    public String displayInfo() {
        return String.format("Бутылка с соком\n\t[Производитель: %s\n\tНаименование: %s\n\tВкус: %s\n\tСтоимость: %.2f\n\tОбъем: %.2f]",
                brand, name, taste, price, volume);
    }

}

