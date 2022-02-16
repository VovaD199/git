package Examples.E016Temp;

public class ScanerNew {
    public static void main(String[] args) {
//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter username");
//
//        String userName = myObj.nextLine();  // Read user input
//        System.out.println("Username is: " + userName);  // Output user input
//
//        int b[] = {1, 2, 3, 4, 5, 6};
        String leftNum = String.valueOf('0');
        String right =  String.valueOf('0');
        String[] ary = "abcdif".split("");
        for (int i = 0; i < ary.length; i++) {
            System.out.println(ary[i]);
            if (i < 3) {
                leftNum = leftNum + ary[i];
            }
            else{
                right = right + ary[i];
            }
            System.out.println(leftNum);
            System.out.println(right);
        }
    }
}

