package lesson06.notes.core.application.interfaces;

import lesson06.notes.core.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface Editor<T, TId> {

    boolean add(T note);

    boolean edit(T note);

    boolean remove(T note);

    Optional<T> getById(TId id);

    Collection<T> getAll();

}
