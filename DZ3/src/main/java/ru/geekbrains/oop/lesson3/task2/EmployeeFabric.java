package ru.geekbrains.oop.lesson3.task2;

import java.util.Random;

public class EmployeeFabric {

    private static Random random = new Random();

    public static Staff generateStaff(){
        String [] position = new String[] { "Рабочий", "Инженер", "Менеджер", "Фрилансер", "Директор" };
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Степан", "Рубен", "Герман", "Игорь", "Илья", "Артём" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов", "Корпусенко", "Смирнов", "Ковалев" };

        int age = random.nextInt(18, 70);
        int salary = random.nextInt(60000, 120001);
        return Staff.create(
                position[random.nextInt(position.length)],
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary);
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     *  разных типов (Worker, Freelancer) в рамках домашней работы
     * @param count
     * @return
     */
    public static Staff[] generateEmployees(int count){
        Staff[] personnel = new Staff[count];
        for (int i = 0; i < count; i++){
            personnel[i] = generateStaff();
        }
        return personnel;
    }

}
