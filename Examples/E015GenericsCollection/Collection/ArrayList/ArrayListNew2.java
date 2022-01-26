package Examples.E015GenericsCollection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListNew2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",'m',22,3,8.3);
        Student st2 = new Student("Nikolay",'m',28,2,6.5);
        Student st3 = new Student("Elena",'f',19,1,8.9);
        Student st4 = new Student("Petr",'m',35,4,7);
        Student st5 = new Student("Mariya",'f',23,3,7.5);

        ArrayList<Student> studentList = new ArrayList();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);
        System.out.println(studentList);

        Student st6 = new Student("Mariya",'f',23,3,7.5);
//        studentList.remove(st6);
        int index = studentList.indexOf(st6);//
        System.out.println(studentList);
        System.out.println(index);// объект st6 есть, но по индексу не находит -1
        System.out.println(studentList.size());//isEmpty, clear
        System.out.println(studentList.contains("Bob"));//Mariya
    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private  int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
    @Override
    public String toString(){
        return "Stusent {" + "name=" + name + "sex=" + sex + "age="+age+
                "course="+course+"avgGrade="+avgGrade+"}";
    }
    //alt+insert->equals
    //удалить hashCode
    //теперь equals будет сравнивать все поля у объекта
    //если у нас два объекта одинаковые, то indexOf найдет первого, если lastIndexOf - то последнего
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
//    }


}