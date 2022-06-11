package questions.JavaBasics02;


import java.util.Scanner;

// Write a program to find the factorial value of any number entered through the keyboard.
// Factorials -:
// 3! = 3*2*1=6
// 4! = 4*3*2*1=24
// 5! = 5*4*3*2*1=120
public class Factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        int input = number;

        int fact = 1;

        for (int i = number; i > 0; i--) {
            fact = fact * i;
            number--;
        }

        System.out.println("Factorial of "+input+" is "+fact);

    }

}
