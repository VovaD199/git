package Examples.E015GenericsCollection.Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListNew2 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan",3);
        Student2 st2 = new Student2("Nikolay",2);
        Student2 st3 = new Student2("Elena",1);
        Student2 st4 = new Student2("Petr",4);
        Student2 st5 = new Student2("Mariya",3);
        LinkedList<Student2>student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println(student2LinkedList);
    }

}
class Student2{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

@Override
    public String toString(){
        return "Stident{"+ "name="+name+"course"+course+"}";
}

}