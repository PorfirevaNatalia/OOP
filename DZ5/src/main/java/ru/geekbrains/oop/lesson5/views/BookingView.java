package ru.geekbrains.oop.lesson5.views;

import ru.geekbrains.oop.lesson5.models.Table;
import ru.geekbrains.oop.lesson5.presenters.View;
import ru.geekbrains.oop.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View {
//
//    private Collection<ViewObserver> observers;
    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

       public void showTables(Collection<Table> tables) {
        for (Table table : tables) {
            System.out.println(table);
        }
    }


    public void reservationTable(Date date, int tableNo, String name) {
        if (observer != null) {
            observer.onReservationTable(date, tableNo, name);
        }
    }
    @Override
    public void showReservationTableResult(int reservationNo) {
        if (reservationNo > 0) {
            System.out.printf("Столик успешно забронирован. Номер брони: #%d\n", reservationNo);
        } else {
            System.out.println("Произошла ошибка при попытке забронировать столик.\nПовторите операцию позже.");
        }
    }

    @Override
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        if (observer != null) {
            observer.onUpdateReservationTable(oldReservation, reservationDate, tableNo, name);
        }
    }

    public void showChangeReservationTable(int newReservationNumber, int newNumberTable) {
        if (newReservationNumber > 0) {
            System.out.printf(
                    "Изменение брони прошло успешно. По номеру брони №%d изменен номер столика. Новый номер столика №%d\n",
                    newReservationNumber, newNumberTable);
        } else {
            System.out.println("Что-то пошло не так, попробуйте повторить попытку позже.");
        }
    }

}
