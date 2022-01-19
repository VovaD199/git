package Examples.E008EncapsulationSettersGettersPolymorphism;

public class EncapsulationSettersAndGetters {
    public static void main(String[] args) {
        Person.getDescription("New");
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("");
        person1.setAge(-5);
        person1.speak();
        person2.setName("Tom");
        person2.setAge(5);
        person2.speak();
        person1.getAge();
    }
}

class Person {
    private String name = "Vova";
    private int age = 10;

    public static String description;

    public static void getDescription(String name) {
        System.out.println(description);
    }


    //по умолчанию
    public Person() {
    }

    //для персон
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void speak() {
        System.out.println("Меня зовут " + this.name + ",мне" + this.age + " ,лет");
    }
}