package com.company;
import java.util.Scanner;
public class BooleanDecision {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your test score");
        int score = scan.nextInt();
        char grade = 'F';



        if (score > 89)
            grade = 'A';
         else if (score > 79)
            grade = 'B';
         else if (score > 69)
            grade = 'C';
         else if (score < 69 && score > 60)
            grade = 'D';
         else
            grade = 'F';


        if (((score % 10) >= 0) && ((score % 10) <= 2))
            System.out.printf("Your grade is -%s %n", grade);
        else if (((score % 10) >= 7) && ((score % 10) <= 9))
            System.out.printf("Your grade is +%s %n", grade);
        else
            System.out.printf("Your grade is %s %n", grade);

        if (score > 69)
            System.out.printf("Very good! You don't have to retake the exam! %s %n " , "");


        else
            System.out.println("Did you even look at the book?");

    }
}