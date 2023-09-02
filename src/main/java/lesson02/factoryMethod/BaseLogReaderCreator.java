package lesson02.factoryMethod;

import lesson02.templateMethod.LogReader;

public abstract class BaseLogReaderCreator {

    protected LogReader createLogReader(LogType logType, Object data) {
        LogReader logReader = createLogReaderInstance(logType);
        // TODO: выполнение подготовительных действий
        logReader.setDataSource(data);
        logReader.setCurrentPosition(2);

        return logReader;
    }

    protected abstract LogReader createLogReaderInstance(LogType logType);
}
