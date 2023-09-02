package hw2;

/**
 * - Описывает класс, который инкрементирует счетчик при создании экземпляра.
 * - Содержит приватную переменную name для хранения имени экземпляра.
 * - Публичный конструктор, который увеличивает счетчик класса Singleton при создании экземпляра.
 */
public class NewInstance {
    private String name;

    public NewInstance(String name) {
        this.name = name;
        int count = Singleton.getCounter();
        Singleton.setCounter(++count);
    }
}
