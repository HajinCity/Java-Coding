import java.util.Scanner;
public class FIVE {
    public static void main(String[] args) {
        /*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125 */
        Scanner Carlos = new Scanner(System.in);

        int a ;
        int b ;

        System.out.print("Input first number: ");
        a=Carlos.nextInt();
        System.out.println();
        System.out.print("Input second number: ");
        b=Carlos.nextInt();
        int c = a * b;
        System.out.println();
        System.out.println(c);
    }
}
