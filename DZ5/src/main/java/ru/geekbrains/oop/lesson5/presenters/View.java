package ru.geekbrains.oop.lesson5.presenters;

import ru.geekbrains.oop.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface View {

    void showTables(Collection<Table> tables);
//
//    void registerObserver(ViewObserver observer);

    void showReservationTableResult(int reservationNo);

    /**
     * Установить наблюдателя за представлением
     *
     * @param observer наблюдатель
     */
    void setObserver(ViewObserver observer);

    /**
     * Отобразить результат изменения бронирования столика
     * 
     * @param reservationNumber номер брони
     */
    void showChangeReservationTable(int reservationNumber, int newNumberTable);


    /**
     * Действие клиента (пользователь нажал на кнопку бронирования),
     * бронирование столика
     * 
     * @param date   дата бронирования
     * @param tableNo номер столика
     * @param name Имя клиента
     */
    void reservationTable(Date date, int tableNo, String name);

    /**
     * Изменение брони столика (пользователь нажал на кнопку изменения резерва)
     * 
     * @param oldReservation  идентификатор бронирования (старый)
     * @param reservationDate дата бронирования
     * @param tableNo     номер столика
     * @param name     Имя
     */
    void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name);
}
