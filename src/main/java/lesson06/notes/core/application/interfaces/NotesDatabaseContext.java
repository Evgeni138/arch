package lesson06.notes.core.application.interfaces;

import lesson06.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    void addNote();

    boolean saveChanges();

}
