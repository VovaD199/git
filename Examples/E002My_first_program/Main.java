package Examples.E002My_first_program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello. What is your name?");
        String name = br.readLine();
        System.out.println("How old are you?");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
/*
Create Console Application project in Java.
In method main() write code for solving next tasks:
Define integer variables a and b. Read values a and b from Console and calculate:
a + b
a - b
a * b
a / b.
Output obtained results.
Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".

 */