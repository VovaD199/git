package Examples.E015GenericsCollection.Collection.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 =  new ArrayList<>();
        arrayList1.add("Tom");
        arrayList1.add("Bob");
        arrayList1.add("Karl");
        arrayList1.add("Dima");

//        System.out.println(arrayList1);
        ArrayList<String> arrayList2 =  new ArrayList<>(12);

        ArrayList<String> arrayList3 =  new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
        System.out.println(arrayList1 == arrayList3);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(7);
        arrayList5.add(new Car());
        System.out.println(arrayList5);

    }
}
class Car {}