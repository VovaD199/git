package Examples.E014OOP;

public class Test {

    public static void main(String[] args) {
        Persona ch1 = new Persona();
        Persona ch2 = new Persona(210,110, "Tom");
        ch1.setName("Toma");
        ch1.going();
        ch2.going();
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch2.getRost());

    }

}
class Persona {
    private double rost = 165;
    private double ves=60;
    private String name="Vasya";
    private int age = 18;

    public double getRost() {
        return rost;
    }

    public double getVes() {
        return ves;
    }

    public String getName() {
        return name;
    }
//
    public int getAge() {
        return age;
    }
//  присваиваем ch2 (объекту класса Persona) новое имя
    public void setName(String name) {
        this.name = name;
    }

    public Persona(){
    }

    public Persona(double rost, double ves, String name) {
        this.rost = rost;
        this.ves = ves;
        this.name = name;
    }

    public void  going (){
        System.out.println("My name"+ name+ "and I make go");
    }

    @Override
    public String toString() {
        return "Persona" +
                "rost=" + rost +
                ", ves=" + ves +
                ", name='" + name + '\'' +
                ", age=" + age ;
    }
}
