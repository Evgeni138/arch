package hw2;

/**
 * - Создает экземпляр Singleton с помощью метода getSingelton() и сохраняет его в переменной example1.
 * - Создает несколько экземпляров класса NewInstance с различными именами (inst1, inst2, inst3, inst4).
 * - Выводит значение счетчика Singleton при помощи метода getCounter().
 * - Создает еще один экземпляр Singleton с помощью метода getSingelton() и сохраняет его в переменной example2.
 * - Сравнивает example1 и example2 на идентичность.
 * - Выводит значение счетчика Singleton после создания второго экземпляра.
 */
public class Program {
    public static void main(String[] args) {
        Singleton example1 = Singleton.getSingelton();

        NewInstance inst1 = new NewInstance("First");
        NewInstance inst2 = new NewInstance("Second");
        NewInstance inst3 = new NewInstance("Third");
        NewInstance2 inst4 = new NewInstance2("Fourth");
        System.out.println(Singleton.getCounter());

        Singleton example2 = Singleton.getSingelton();
        System.out.println(example1 == example2);

        System.out.println(Singleton.getCounter());
    }
}
