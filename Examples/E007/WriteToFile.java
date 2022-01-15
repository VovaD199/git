package Examples.E007;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("notes5");
        PrintWriter pw = new PrintWriter("file");

        pw.println("Test row1");
        pw.println("Test row2");

        pw.close();
    }
}
//Записанный файл находится в корне проекта, в папке "src".
//В файл записывается текст из строк 12-13.
//При повторном запуске, текст перетерается.