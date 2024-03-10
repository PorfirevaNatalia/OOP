package ru.geekbrains.oop.lesson2.DZ2;

public class Plate {
    private int food;
    public Plate(int food) {
        if (food < 0) {
            this.food = 10;
        }
        else {
        this.food = food;
        }
    }

    public void info() {
        System.out.println("В тарелке осталось еды: " + food);
    }


    public int getFood() {
        return food;
    }


    public void setFood(int food) {
        this.food = food;
    }

    public void addPlate(int food){
        if (food > 0) this.food += food;
        
    }
    
    
}
