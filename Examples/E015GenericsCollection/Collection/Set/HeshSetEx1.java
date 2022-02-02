package Examples.E015GenericsCollection.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HeshSetEx1 {
    public static void main(String[] args) {
        Set <String> set = new HashSet<>();
        set.add("Ivan");
        set.add("Oleg");
        set.add("Petr");
        set.add("Nikita");
        set.add("Sasha");
        set.add("Ivan");
        set.size();

        Set <String> set2 = new HashSet<>();
        set2.add("Lesya");
        set2.add("Sergey");
        set2.add("Petr");
        set2.add("Tom");
        set2.add("Sasha");
        set2.add("Ivan");

        Set <String> set3 = new HashSet<>(set);
        System.out.println(set3);
//        for (String s:set){
//            System.out.println(s);
//        }
    }
}
