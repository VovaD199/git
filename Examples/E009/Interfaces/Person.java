package Examples.E009.Interfaces;

public class Person implements Info {
    public String name;

// alt+Insert = Const
    public Person(String name) {
        this.name = name;
    }

    public void seyHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is "+this.name);
    }
}
