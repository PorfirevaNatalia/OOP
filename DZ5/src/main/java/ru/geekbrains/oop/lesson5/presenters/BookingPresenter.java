package ru.geekbrains.oop.lesson5.presenters;

import java.util.Date;

public class BookingPresenter implements ViewObserver {

    private final Model model;
    private final View view;

    public BookingPresenter(Model model, View view){
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }


    public void updateTablesView(){
        view.showTables(model.loadTables());
    }

    private void updateReservationTableView(int reservationNo){
        view.showReservationTableResult(reservationNo);
    }

    public void updateShowChangeReservationTable(int reservationNo, int numberTable) {
        view.showChangeReservationTable(reservationNo, numberTable);
    }

    @Override
    public void onReservationTable(Date date, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(date, tableNo, name);
            updateReservationTableView(reservationNo);
        }
        catch (Exception e){
            updateReservationTableView(-1);
        }

    }

    @Override
    public void onUpdateReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            int newReservationNumber = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
            updateShowChangeReservationTable(newReservationNumber, tableNo);
        } catch (RuntimeException e) {
            updateShowChangeReservationTable(-1, -1);
        }
    }
}
