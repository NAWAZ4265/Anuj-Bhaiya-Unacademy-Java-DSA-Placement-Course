package questions.JavaBasics01;


import java.util.Scanner;

// Write a Java program to print the area and perimeter of a circle.
public class PerimeterAndAreaOfCircle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle : ");
        double radius = scanner.nextDouble();

        double perimeter = 2 * Math.PI * radius;

        double area = Math.PI * radius * radius;

        System.out.println(" Perimeter is : " + perimeter + " and area is : " + area);

    }

}
