package ru.geekbrains.oop.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date date, int tableNo, String name);


     /**
     * Произошло событие изменения брони столика
     *
     * @param oldReservation  предыдущий номер брони
     * @param reservationDate новая дата брони
     * @param tableNo     новый номер столика
     * @param name     имя клиента
     */
    void onUpdateReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}

