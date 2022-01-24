package Examples.E009InterfacesAbstract_classes.Interfaces;

public class Animal implements Info{
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("Animal. I am sleeping");
    }

    public void showInfo(){
        System.out.println("Animal. Id is "+this.id*2);
    }
}
