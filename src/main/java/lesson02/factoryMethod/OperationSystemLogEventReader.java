package lesson02.factoryMethod;

import lesson02.templateMethod.LogEntry;
import lesson02.templateMethod.LogReader;

public class OperationSystemLogEventReader extends LogReader {
    @Override
    public Object getDataSource() {
        return null;
    }

    @Override
    public void setDataSource(Object data) {

    }

    @Override
    protected Iterable<String> readEntry(Integer position) {
        return null;
    }

    @Override
    protected LogEntry parseLogEntries(String stringEntry) {
        return null;
    }
}
