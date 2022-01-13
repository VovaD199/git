package Examples.E006Methods;

public class Main1 {
    public static void main(String args[]) {

        hello();
        welcome(1);
        welcome(2);
        display("Bob", 28);
    }

    static void hello() {

        System.out.println("Hello");
    }

    static void welcome(int i) {
//        i++;
        System.out.println("Welcome to Java 10 + " + i);
    }
    static void display(String name, int age){

        System.out.println(name);
        System.out.println(age);
    }
}
