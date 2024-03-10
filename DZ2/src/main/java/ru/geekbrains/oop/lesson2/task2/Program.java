package ru.geekbrains.oop.lesson2.task2;

import java.util.ArrayList;
import java.util.Objects;

public class Program {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat #1", "Color #1");




        Runnable cat2 = new Cat("Cat #2", "Color #2");
        Runnable cat3 = new Cat("Cat #3", "Color #3");
        Runnable dog1 = new Dog("Dog #1", 3);
        Runnable dog2 = new Dog("Dog #2", 5);

        ArrayList<Object> runners = new ArrayList<>();
        runners.add(cat1);
        runners.add(cat2);
        runners.add(cat3);
        runners.add(dog1);
        runners.add(dog2);

        for (Object animal : runners)
        {
            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                System.out.println(cat.getColor());
            }

        }

    }

}
