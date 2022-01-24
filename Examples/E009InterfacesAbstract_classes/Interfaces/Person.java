package Examples.E009InterfacesAbstract_classes.Interfaces;

public class Person implements Info {
    private String name;

// alt+Insert = Const
    public Person(String name) {
        this.name = name;
    }

    public void seyHello(){
        System.out.println("Person, seyHello");
    }

    @Override
    public void showInfo() {
        System.out.println("Person. Name is "+this.name);
    }
}
