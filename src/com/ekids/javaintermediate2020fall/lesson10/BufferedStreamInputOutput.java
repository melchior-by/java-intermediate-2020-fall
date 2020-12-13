package com.ekids.javaintermediate2020fall.lesson10;

import java.io.*;
/*BAD SOLUTION - DIDN'T WORK WITH CHARSETS*/
public class BufferedStreamInputOutput {
    public static void main(String[] args) {
        /*getProperty():
        WIN - C:/users/someusername
        MAC OS, LINUX - /home
        * */
        String directory = System.getProperty("user.home");
        String fileName = "sample.txt";
        /*
        * '/' в качестве разделителя пути - плохая практика,
        * хорошая - всегда используйте File.separator
        * */
        String absolutePath = directory + File.separator + fileName;

        /*
        * FileOutputStream -> BufferedOutputStream
        *
        * */

        // write the content in file
        // мы используем try-with-resources запись чтобы не закрывать стрим самостоятельно с помощью finally
        /*
        * try {
        * } catch(err) - простой try
        * try () {
        * } catch(err) - простой try*/
        try(BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(absolutePath))) {
            String fileContent = "пример";
            bufferedOutputStream.write(fileContent.getBytes());
        } catch (IOException e) {
            // exception handling
        }
        /*ВСЕГДА ЗАКРЫВАЙТЕ СТРИМЫ*/

        // read the content from file
        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(absolutePath))) {
            int ch = bufferedInputStream.read();
            while(ch != -1) {
                System.out.print((char)ch);
                ch = bufferedInputStream.read();
            }
        } catch (IOException e) {
            // exception handling
        }
    }
}
