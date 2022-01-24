package Examples.E013.lambda;

import java.util.Arrays;
import java.util.List;

public class lambda2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Старый способ:
        for (Integer n : list) {
            System.out.println(n);
        }

        // Новый способ:
        list.forEach(n -> System.out.println(n*n));

        //с использованием оператора двойного двоеточия (::)
        list.forEach(System.out::println);
    }
}
