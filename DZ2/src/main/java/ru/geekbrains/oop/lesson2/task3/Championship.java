package ru.geekbrains.oop.lesson2.task3;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    public static void main(String[] args) {

        // Объявим бегунов
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Персик", 1700, 220),
                new Robot("R2D2", 99999, 0),
                new Robot("C3PO", 5000, 50),
                new Human("Петя", 2500, 150),
                new Human("Вася", 3500, 250)
        };

        // Объявим препятствия
        Obstacle[] obstacles = {
                new Track(1200),
                new Wall(30),
                new Track(2000),
                new Wall(140),
                new Track(3000),
                new Wall( 250)
        };

        for (Runner r : runners) {
            for (Obstacle o : obstacles) {
                if (o instanceof Track){
                    if (!r.run(o.getLength()))
                        break;
                }
                else if (o instanceof Wall){
                    if (!r.jump(o.getHeight()))
                        break;
                }
            }
        }



    }

}
