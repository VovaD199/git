package Examples.E011Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2.3, 3.3, 4.3);
        countArea(t1);
    }

    private static Double countArea(Triangle t1) {
        double a = t1.getA();
        double b = t1.getB();
        double c = t1.getC();
        double p1 = (a + b + c) / 2;
        double s1 = Math.sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
        System.out.println("The area of your triangle: %f" + s1);
        return s1;
    }
}

class Triangle {
    public Double getA() {
        return a;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public String getTriangleName() {
        return triangleName;
    }

    Double a;
    Double b;
    Double c;
    String triangleName;
    //конструктор для треуголников
    public Triangle(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

}

