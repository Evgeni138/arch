package lesson06;

import lesson06.database.NotesDatabase;
import lesson06.notes.core.application.ConcreteNoteEditor;
import lesson06.notes.infrastructure.persistance.NotesDbContext;
import lesson06.notes.presentation.queries.controllers.NotesController;
import lesson06.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));

        controller.routeGetAll();
        controller.routeAddNote();
        System.out.println();
        controller.routeGetAll();

    }
}
