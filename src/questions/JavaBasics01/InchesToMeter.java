package questions.JavaBasics01;

import java.util.Scanner;

// Write a Java program that reads a number in inches, converts it to meters. 1 inch = 0.0254 meter
public class InchesToMeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inches : ");
        int inches = scanner.nextInt();

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is " + meters + " meters");

    }

}
