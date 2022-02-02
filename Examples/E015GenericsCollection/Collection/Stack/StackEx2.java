package Examples.E015GenericsCollection.Collection.Stack;

import java.util.Stack;

public class StackEx2 {
    public static void main(String[] args) {
        Stack <String> stack1 = new Stack<>();
        stack1.push("Ivan");
        stack1.push("Taras");
        stack1.push("Tom");
        stack1.push("John");
        stack1.push("Karl");
        stack1.add("Kolya");
//        System.out.println(stack1);
//        System.out.println(stack1.search("Tom"));
//        System.out.println(stack1.search("Kolya"));
//        while (!stack1.isEmpty()){
//            System.out.println(stack1.pop());
//            System.out.println(stack1);
//        }
        System.out.println(stack1.peek());
        System.out.println(stack1);
    }
}
