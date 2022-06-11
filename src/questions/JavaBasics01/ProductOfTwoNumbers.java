package questions.JavaBasics01;


import java.util.Scanner;

// Write a Java program that takes two numbers as input and display the product of two numbers.
public class ProductOfTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();

        int multiplication = num1 * num2;

        System.out.println("Product of "+num1+" and "+num2+" is "+multiplication);

    }

}
