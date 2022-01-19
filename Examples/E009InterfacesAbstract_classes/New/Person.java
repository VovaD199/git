package Examples.E009InterfacesAbstract_classes.New;

public class Person implements Info {
    public Person(String name) {
        this.name = name;
    }

    private String name;


    public void seyHello(){
        System.out.println("Hello");
    }

    public void showInfo(){
        System.out.println("Is name "+ this.name);
    }

}
