package questions.JavaBasics01;


import java.util.Scanner;

//  Write a Java program to grade students based on their marks.
public class StudentGradesBasedOnTotalMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total number between 0-100");
        int totalMarks= scanner.nextInt();

        if(totalMarks>=80){
            System.out.println("Grade A");
        } else if(totalMarks<80 && totalMarks>=60){
            System.out.println("Grade B");
        } else if(totalMarks<60 && totalMarks>=45){
            System.out.println("Grade C");
        } else if(totalMarks<45 && totalMarks>=30){
            System.out.println("Grade D");
        } else {
            System.out.println("Grade E");
        }

    }

}
