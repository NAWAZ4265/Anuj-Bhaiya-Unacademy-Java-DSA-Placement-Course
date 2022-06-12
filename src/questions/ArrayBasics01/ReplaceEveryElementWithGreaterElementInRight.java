package questions.ArrayBasics01;


import java.util.Scanner;

// Write a program to replace every element with the greatest element on its right side.
// Expected Output :
// The given array is : 7 5 8 9 6 8 5 7 4 6
// After replace the modified array is: 9 9 9 8 8 7 7 6 6 O
public class ReplaceEveryElementWithGreaterElementInRight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter the element of array : ");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            numbers[i] = element;
        }

        int max = numbers[size - 1];
        int[] newArray = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            if (i == size - 1) {
                newArray[i] = 0;
            } else {
                newArray[i] = max;
            }

            if (max < numbers[i]) {
                max = numbers[i];
            }

        }

        System.out.print("Printing the array by replacing the element with larger value in right : ");
        for (int i = 0; i < size; i++) {
            System.out.print(newArray[i]+", ");
        }

    }

}
