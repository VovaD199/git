package Examples.E007Constructor_reading_and_writing_to_a_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class E007BufferedWriter {
    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes4.txt"))) {
            String text = "Hello  World!\nHey! May the force be with you!";
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
//Записанный файл находится в корне проекта, в папке "src".
//В файл записывается текст из строки 11.
//При повторном запуске, текст перетерается.