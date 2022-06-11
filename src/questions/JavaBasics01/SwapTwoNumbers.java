package questions.JavaBasics01;


import java.util.Scanner;

// Write a Java program to swap two numbers.
public class SwapTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("Swap values are " + num1 + " and " + num2);

    }

}
