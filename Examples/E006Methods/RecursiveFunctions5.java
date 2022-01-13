package Examples.E006Methods;

public class RecursiveFunctions5 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    static int factorial(int x){

        if (x == 1){

            return 1;
        }
        return x * factorial(x - 1);
    }
}
