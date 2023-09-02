package lesson02.templateMethod;

public class Program {
    public static String data = """
            Унылая пора! Очей очарованье!
            Приятна мне твоя прощальная краса —
            Люблю я пышное природы увяданье,
            В багрец и в золото одетые леса,
            В их сенях ветра шум и свежее дыханье,
            И мглой волнистою покрыты небеса,
            И редкий солнца луч, и первые морозы,
            И отдаленные седой зимы угрозы.
            """;

    public static void main(String[] args) {
        LogReader logReader = new PoemReader(data);
        logReader.setCurrentPosition(3);

        for (LogEntry log: logReader.readLogEntry()) {
            System.out.println(log.getText());
        }
    }
}
