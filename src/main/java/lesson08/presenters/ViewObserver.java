package lesson08.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onChangeReservationTable(int oldReservation, Date reservationDate, int table,
                                  String name);

}
