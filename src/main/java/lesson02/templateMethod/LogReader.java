package lesson02.templateMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Основа работы алгоритма чтения данных
 */
public abstract class LogReader {
    private int currentPosition = 0;

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }

    public Iterable<LogEntry> readLogEntry() {
        List<LogEntry> logList = new ArrayList<>();
        for (String str: readEntry(currentPosition)) {
            logList.add(parseLogEntries(str));
        }
        return logList;
    }

    public abstract Object getDataSource();

    public abstract void setDataSource(Object data);

    abstract protected Iterable<String> readEntry(Integer position);

    abstract protected LogEntry parseLogEntries(String stringEntry);
}
