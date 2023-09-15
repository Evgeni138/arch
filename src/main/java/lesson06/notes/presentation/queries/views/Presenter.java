package lesson06.notes.presentation.queries.views;

import lesson06.notes.core.domain.Note;

import java.util.Collection;

public interface Presenter {

    void printAll(Collection<Note> notes);

}
