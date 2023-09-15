package lesson06.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private Random random = new Random();

    Collection<NotesRecord> records;

    public void setRecords(Collection<NotesRecord> records) {
        this.records = records;
    }

    public Collection<NotesRecord> getRecords() {
        if (records == null) {
            records = new ArrayList<>();
            int recordsCount = 5 + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++) {
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
        return records;
    }

    public void addRecord() {
        NotesRecord record = new NotesRecord("title #" + (records.size()),
                "details #" + (records.size()));
        if (records == null)
            records = new ArrayList<>();
        records.add(record);
    }

}
