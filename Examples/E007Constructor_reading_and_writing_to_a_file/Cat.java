package Examples.E007Constructor_reading_and_writing_to_a_file;


public class Cat {

    String name;
    int age;

    //для домашних котов
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //для уличных котов
    public Cat() {
    }

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 5);
        Cat streetCat = new Cat();
    }
}
