package Examples.E015GenericsCollection.Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListNew1 {

    public static void main(String[] args) {

        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Portugal");
        for (String state : states) {

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if (states.contains("Germany")) {

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        LinkedList<Person> people = new LinkedList<Person>();
        people.add(new Person("Mike"));
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        people.remove(1); // удаление второго элемента

        for (Person p : people) {

            System.out.println(p.getName());
        }
        Person first = people.getFirst();
        System.out.println(first.getName()); // вывод первого элемента
    }
}

class Person {

    private String name;

    public Person(String value) {

        name = value;
    }

    String getName() {
        return name;
    }
}
/*
Здесь создаются и используются два списка: для строк и для объектов класса Person. П
ри этом в дополнение к методам addFirst/removeLast и т.д.,
нам также доступны стандартные методы, определенные в интерфейсе Collection:
add(), remove, contains, size и другие.
Поэтому мы можем использовать разные методы для одного и того же действия.
Например, добавление в самое начало списка можно сделать так:
states.addFirst("Spain");, а можно сделать так: states.add(0, "Spain");
 */