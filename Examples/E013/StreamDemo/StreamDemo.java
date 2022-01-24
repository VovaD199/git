package Examples.E013.StreamDemo;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Старый способ:
        for (Integer n : list) {
            int x = n * n;
            System.out.println(x);
        }

        // Новый способ:
        list.stream().map((x) -> x * x).forEach(System.out::println);
/*
Мы передаем lambda-выражение x -> x*x в метод map(), который применяет его ко всем элементам в потоке.
После чего мы используем forEach для печати всех элементов списка.
 */
    }
}
