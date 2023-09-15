package lesson06.notes.core.application;

import lesson06.notes.core.application.interfaces.NoteEditor;
import lesson06.notes.core.application.interfaces.NotesDatabaseContext;
import lesson06.notes.core.application.interfaces.NotesPresenter;
import lesson06.notes.core.domain.Note;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(NotesDatabaseContext dbContext, NotesPresenter notesPresenter) {
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note note) {
        dbContext.getAll().add(note);
        return dbContext.saveChanges();
    }

    @Override
    public boolean edit(Note note) {
        if (note == null)
            return false;
        Optional<Note> note1 = getById(note.getId());
        if (note1.isEmpty())
            return false;
        note1.get().setTitle(note.getTitle());
        note1.get().setDetails(note.getDetails());
        note1.get().setEditDate(new Date());
        return dbContext.saveChanges();
    }

    @Override
    public boolean remove(Note note) {
        dbContext.getAll().remove(note);
        return dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return dbContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }

    @Override
    public void addNote() {
        dbContext.addNote();
    }
}
