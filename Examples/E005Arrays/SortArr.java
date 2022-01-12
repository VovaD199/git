package Examples.E005Arrays;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] myList = {2, 4, 6, 1, 8};
        arreY(myList);
    }

    public static ArrayList<Integer> arreY(int[] myList) {
        ArrayList<Integer> array_1 = new ArrayList<>();

        for (int element : myList) {
            double result = element / 2;
            array_1.add((int) result);

        }
        System.out.println(array_1+ " - массив \"myList \", в котором элементы делили на 2");
        Arrays.sort(myList); // Вот тут библиотека уже все отсортировала
        System.out.println(Arrays.toString(myList) + " - отсортированый массив \"myList \" "); // тут выводим отсортированый массив
        return array_1;
    }
/*
     Второй вариант. Если закомментировать строки 8-2 и раскомментировать 30-48
 */

//    public static void main(String[] args) {
//
//        // initializing unsorted Object array
//        Object ob[] = {27, 11, 44};
//
//        // let us print all the elements available in list
//        for (Object number : ob) {
//            System.out.println("Number = " + number);
//        }
//
//        // sorting array
//        Arrays.sort(ob);
//
//        // let us print all the elements available in list
//        System.out.println("The sorted Object array is:");
//        for (Object number : ob) {
//            System.out.println("Number = " + number);
//        }
//    }
}
