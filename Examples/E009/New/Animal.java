package Examples.E009.New;

public class Animal implements Info {

    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("Sleep");
    }

    @Override
    public void showInfo(){
        System.out.println("Is id "+this.id);
    }

}
