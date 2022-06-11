package questions.JavaBasics02;


import java.util.Scanner;

// Write a Java method to find the smallest number among three numbers.
public class SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = scanner.nextInt();
        System.out.print("Enter second number : ");
        int second = scanner.nextInt();
        System.out.print("Enter third number : ");
        int third = scanner.nextInt();

        if (first < second && first < third) {
            System.out.println(first + " is smallest than " + second + " and " + third);
        } else if (second < third) {
            System.out.println(second + " is smallest than " + first + " and " + third);
        } else {
            System.out.println(third + " is smallest than " + first + " and " + second);
        }

    }

}
