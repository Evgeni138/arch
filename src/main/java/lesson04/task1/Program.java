package lesson04.task1;

import java.io.File;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        File file = new File("./src/main/java/lesson04/task1/file.txt");

        ArrayList<String> text = new ArrayList<>(productService.readTextFile(file));

        productService.printText(text);
    }

}
