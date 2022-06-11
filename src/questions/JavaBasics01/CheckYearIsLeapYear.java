package questions.JavaBasics01;


import java.util.Scanner;

// Write a Java program that takes a year from user and print whether that year is a leap year or not.
public class CheckYearIsLeapYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year : ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {

            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }

        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

    }

}
