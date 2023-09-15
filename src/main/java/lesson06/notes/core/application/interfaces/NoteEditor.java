package lesson06.notes.core.application.interfaces;

import lesson06.notes.core.domain.Note;

public interface NoteEditor extends Editor<Note, Integer> {

    void printAll();

    void addNote();

}
