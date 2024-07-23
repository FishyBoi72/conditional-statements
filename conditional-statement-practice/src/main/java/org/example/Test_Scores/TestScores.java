package org.example.Test_Scores;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        int grade = scanner.nextInt();

        if (grade >= 90){
            System.out.println("Congratulations! Your grade is A.");
        } else if (grade >= 80){
            System.out.println("Pretty good, you got a B!");
        } else if (grade >= 70){
            System.out.println("You passed, but could have improved. You got a C.");
        } else if (grade >= 60){
            System.out.println("You can always try again. You got a D.");
        } else {
            System.out.println("Sorry, you failed. You got an F.");
        }
    }
}
