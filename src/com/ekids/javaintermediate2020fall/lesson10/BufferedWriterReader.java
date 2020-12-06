package com.ekids.javaintermediate2020fall.lesson10;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedWriterReader {
    public static void main(String[] args) {
        String directory = System.getProperty("user.home");
        String fileName = "sample.txt";
        String absolutePath = directory + File.separator + fileName;

        // write the content in file

        /*FileOutputStream -> OutputStreamWriter -> BufferedWriter*/
        /*передаем true как параметр в FileOutputStream если хотим добавлять в файл а не записывать заново*/
        try (BufferedWriter out = new BufferedWriter
                (new OutputStreamWriter(new FileOutputStream(absolutePath, true), StandardCharsets.UTF_8))) {
            String fileContent = "пример текста";
            out.write(fileContent);
        } catch (IOException e) {
            // exception handling
        }

        // read the content from file
        try (BufferedReader in = new BufferedReader
                (new InputStreamReader(new FileInputStream(absolutePath), StandardCharsets.UTF_8))) {
            int ch = in.read();
            while (ch != -1) {
                System.out.print((char) ch);
                ch = in.read();
            }
        } catch (IOException e) {
            // exception handling
        }
    }
}
