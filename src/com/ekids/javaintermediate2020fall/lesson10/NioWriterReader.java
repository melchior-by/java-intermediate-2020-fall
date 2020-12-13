package com.ekids.javaintermediate2020fall.lesson10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
/*NIO - новый способ работы с файлами*/
public class NioWriterReader {
    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "sample.txt";

        String content = "Привет мир";
        Path path = Paths.get(directory, fileName);

        try {
            Files.write(path, content.getBytes(), StandardOpenOption.CREATE_NEW);
        } catch(IOException e) {
            // exception handling
        }

        try {
            /*2 способа чтения из файла*/
            List<String> list = Files.readAllLines(path);
            list.forEach(System.out::println);

            byte[] data = Files.readAllBytes(path);
            System.out.println(new String(data));
        } catch(IOException e) {
            // exception handling
        }
    }

}
