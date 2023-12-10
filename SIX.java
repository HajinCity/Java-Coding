import java.util.Scanner;
public class SIX {
    public static void main(String[] args) {
        /*
         * Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
         */
        Scanner Carlos =new Scanner(System.in);

        int ale;
        int bax;

        

        System.out.print("Input first number: ");
        ale=Carlos.nextInt();
        System.out.println();

        System.out.println("Input second number: ");
        bax=Carlos.nextInt();

        System.out.println();

        int sum = ale + bax;
        int sub = ale - bax;
        int mutl = ale * bax;
        int div = ale / bax;
        int mod = ale % bax;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mutl);
        System.out.println(div);
        System.out.println(mod);



    }
}
