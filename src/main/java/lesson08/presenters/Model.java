package lesson08.presenters;

import lesson08.models.Reservation;
import lesson08.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {

    Collection<Table> loadTables();

    Collection<Reservation> loadReservations();

    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date reservationDate, int table,
                               String name);

}
