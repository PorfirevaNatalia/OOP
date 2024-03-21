package ru.geekbrains.oop.lesson5.presenters;

import ru.geekbrains.oop.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    int reservationTable(Date reservationDate, int tableNo, String name);

    /**
     * Изменение брони столика (пользователь нажал на кнопку изменения резерва)
     * 
     * @param oldReservation  предыдущее резервирование столика
     * @param reservationDate дата резервировния
     * @param tableNo     номер столика
     * @param name     имя клиента
     * @return новый номер резервировния
     */
    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
