package Examples.E009InterfacesAbstract_classes.Interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Tom");
        animal1.sleep();
        person1.seyHello();
        animal1.showInfo();
        person1.showInfo();
        // применим новый тип данных Info
        Info info1 = new Animal(1);
        Info info2 = new Person("Nick");
        info1.showInfo();
        info2.showInfo();

        //
        outputInfo(animal1);
        outputInfo(person1);
    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
