package Examples.E017;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Main.fileReader("Bye");
        Main.fileWriter("Hello", "Bye");
    }

    public static void fileReader(String toFind) {
        String str = "";
        int count = 0;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("notes5.txt"))) {

            while ((str = br.readLine()) != null) {
                stringBuilder.append(str).append("\n");
                if (str.contains(toFind)) {
                    count++;
                }
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println(count);

    }

    public static void fileWriter(String toFind, String toReplace) throws IOException {
        String str = "";

        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader("notes5.txt"));

        while ((str = br.readLine()) != null) {
            stringBuilder.append(str.replace(toFind, toReplace)).append("\n");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("notes5.txt"))) {

            bw.write(stringBuilder.toString());
        }
    }

}
