package lesson08;

import lesson08.models.Table;
import lesson08.models.TableModel;
import lesson08.presenters.BookingPresenter;
import lesson08.presenters.Model;
import lesson08.presenters.View;
import lesson08.views.BookingView;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        View view = new BookingView();
        Model model = new TableModel();
        BookingPresenter presenter = new BookingPresenter(model, view);
        presenter.updateUIShowTables();
        presenter.updateUIShowReservations();

        view.reservationTable(new Date(), 2, "Евгений");
        view.reservationTable(new Date(), 3, "Юля");
        view.reservationTable(new Date(), 4, "Вика");

        System.out.println();

        presenter.updateUIShowReservations();

        System.out.println();

        view.changeReservationTable(1001, new Date(), 1, "Евгений");

        System.out.println();

        presenter.updateUIShowReservations();

    }
}
