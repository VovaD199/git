package Examples.E007;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E007BufferedReader {
    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new FileReader("notes4.txt")))
        {
            // чтение посимвольно
            int c;
            while((c=br.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
//Чтение файла из корня проекта, в папке "src".