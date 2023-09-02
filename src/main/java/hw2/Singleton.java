package hw2;

/**
 * - Описывает синглтон - класс, который может иметь только один экземпляр.
 * - Содержит статическую переменную instance, которая хранит единственный экземпляр объекта класса Singleton.
 * - Содержит статическую переменную counter, которая хранит количество созданных экземпляров класса NewInstance и
 * NewInstance2.
 * - Приватный конструктор, который устанавливает значение счетчика в 0.
 * - Статический метод getCounter(), который возвращает значение счетчика.
 * - Статический метод setCounter(int count), который устанавливает значение счетчика.
 * - Статический метод getSingleton(), который возвращает единственный экземпляр класса Singleton, если он еще не
 * создан.
 */
public class Singleton {
    private static Singleton instance;
    private static int counter;
    private Singleton() {
        this.counter = 0;
    };

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int count) {
        Singleton.counter = count;
    }

    public static Singleton getSingelton() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
