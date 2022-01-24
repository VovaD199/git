package Examples.E013.lambda;

public class lambda {

    public static void main(String[] args) {

        Operationable operation;        //Определение ссылки на функциональный интерфейс
        operation = (x, y) -> x + y;    //Создание лямбда-выражения
        //для одного функционального интерфейса мы можем определить множество лямбда-выражений
        Operationable operation1 = (int x, int y)-> x + y;
        Operationable operation2 = (int x, int y)-> x - y;
        Operationable operation3 = (int x, int y)-> x * y;

        int result = operation.calculate(10, 20);   //Использование лямбда-выражения в виде вызова метода интерфейса
        System.out.println(result);     //30
        System.out.println(operation1.calculate(20, 10)); //30
        System.out.println(operation2.calculate(20, 10)); //10
        System.out.println(operation3.calculate(20, 10)); //200
    }
}
                                        //функциональный интерфейс
interface Operationable {
    int calculate(int x, int y);        //метод без реализации
}
