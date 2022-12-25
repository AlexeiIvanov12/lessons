package lesson10.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        File file = new File("src/lesson10/files/hello.txt");
        try
            (Scanner scanner = new Scanner(file)) {;

            // Чтение из файла
            while (scanner.hasNextLine())
                System.out.println((scanner.nextLine()));
            scanner.close();

        } catch (FileNotFoundException e) {
            LOG.info("Не удалось найти указанный файл");
            System.out.println();
        }

//        Еще один способ чтения из файла
        Path path = Paths.get("src/lesson10/files/hello.txt");
        try {
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            System.out.println(content);

//            System.out.println(Arrays.toString(bytes));

            Files.write(path, "it is new content".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            LOG.info("Не удалось найти указанный файл");
        }
    }
}
