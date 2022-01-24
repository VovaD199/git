package Examples.E013.StreamDemo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
// Старый способ:
//        int sum = 0;
//        for (Integer n : list) {
//            int x = n * n;
//            sum = sum + x;
//        }

        // Новый способ:
        int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();


        System.out.println(sum);
/*
В этом примере применен метод свертки (редукции) reduce().
Мы используем метод map() для возведения в квадрат каждого элемента,
а потом применяем метод reduce() для свертки всех элементов в одно число.
 */
    }
}
