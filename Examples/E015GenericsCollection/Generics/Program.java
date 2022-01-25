package Examples.E015GenericsCollection.Generics;

public class Program{

    public static void main(String[] args) {

        AccountNew<String, Double> acc1 = new AccountNew<String, Double>("354", 5000.87);
        String id = acc1.getId();
        Double sum = acc1.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}
class AccountNew<T, S>{

    private T id;
    private S sum;

    AccountNew(T id, S sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public S getSum() { return sum; }
    public void setSum(S sum) { this.sum = sum; }
    /*
    В данном случае тип String будет передаваться на место параметра T, а тип Double - на место параметра S.
     */
}
