package ru.geekbrains.oop.lesson2.DZ2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    
    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
    

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite < 1) {
            this.appetite = 10;
        }
        else {
        this.appetite = appetite;
        }
    }

    public Cat(String name) {
        this(name, 10);
    }

    public Cat(){
        this("UnknownCat"); 
    }


    public Integer eat(int food) { 
        if (this.appetite <= food && !satiety) {
            satiety = true;
            System.out.println("Котик " + this.name + " съел " + this.appetite + " еды");
            return (food - this.appetite);
            }
        else {
            System.out.println("Еды в тарелке недостаточно для " + this.name);
            return food;
        }
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAppetite() {
        return appetite;
    }


    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", appetite=" + appetite + ", satiety=" + satiety + "]";
    }

  
    
}
