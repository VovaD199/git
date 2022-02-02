package Examples.E015GenericsCollection.Collection.Vector;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector <String> vector1 = new Vector<>();
        vector1.add("Ivan");
        vector1.add("Oleg");
        vector1.add("Nikita");
        vector1.add("John");
        vector1.add("Lesya");
        System.out.println(vector1);
        System.out.println(vector1.firstElement());
        System.out.println(vector1.lastElement());
        vector1.remove(2);
        System.out.println(vector1);
        System.out.println(vector1.get(2));
    }
}
