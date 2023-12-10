import java.util.Scanner;
public class SEVEN {
    public static void main(String[] args) {
        /*
         * Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
         */
        Scanner Carlos = new Scanner(System.in);
        System.out.print("Input a number: ");
        int a = Carlos.nextInt();

        for(int x=1 ; x <=10; x++){
            int c = a * x;
            System.out.println(a +" x "+ x +" = "+ c);
        }
    }
}
