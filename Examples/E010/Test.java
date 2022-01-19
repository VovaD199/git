package Examples.E010;

public class Test {
    public final static String CONSTANT = "CONSTANT";
    public final static Integer CONSTP = 3;
}

class Test2 {
    public Test2() {
    }

    //сеттер
    public static void setNumber(int number) {
        Test2.number = number;
    }

    //геттер
    public static int getNumber() {
        return number;
    }

    private static int number = 5;
}
