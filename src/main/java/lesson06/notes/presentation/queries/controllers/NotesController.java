package lesson06.notes.presentation.queries.controllers;

import lesson06.notes.core.application.interfaces.NoteEditor;
import lesson06.notes.core.domain.Note;

import java.util.Scanner;

public class NotesController extends Controller{

    private final NoteEditor noteEditor;

    public NotesController(NoteEditor noteEditor) {
        this.noteEditor = noteEditor;
    }

    public void routeAddNote() {
        this.noteEditor.addNote();
    }

    public void routeRemoveNote(Note note) {
        this.noteEditor.remove(note);
    }

    public void routeGetAll() {
        this.noteEditor.printAll();
    }

//    public void switchOnApp() {
//        Scanner scanner = new Scanner(System.in);
//        boolean f = true;
//        while (f) {
//            System.out.println();
//            System.out.println("*** Мой блокнот ***");
//            System.out.println("***********************");
//            System.out.println("1. Посмотреть все записи.");
//            System.out.println("2. Добавить новую запись.");
//            System.out.println("0. ЗАВЕРШЕНИ РАБОТЫ ПРИЛОЖЕНИЯ.");
//            System.out.println("Пожалуйста, выберите пункт меню.");
//            if (scanner.hasNextInt()) {
//                int no = scanner.nextInt();
//                scanner.nextLine();
//                try {
//                    switch (no) {
//                        case 0:
//                            System.out.println("Завершение работы приложения.");
//                            f = false;
//                            break;
//                        case 1:
//                            routeGetAll();
//                            break;
//                        case 2:
//                            routeAddNote();
//                            break;
//                        default:
//                            System.out.println("Укажите корректный пункт меню.");
//                            scanner.nextLine();
//                    }
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            } else {
//                System.out.println("Укажите корректный пункт меню.");
//                scanner.nextLine();
//            }
//
//        }
//
//    }


}
