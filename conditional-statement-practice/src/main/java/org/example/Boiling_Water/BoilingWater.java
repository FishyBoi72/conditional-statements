package org.example.Boiling_Water;

import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the temperature (only number) of the water?");
        int temp = scanner.nextInt();
        if (temp >= 212){
            System.out.println("The water is boiling!");
        } else {
            System.out.println("The water is not boiling.");
        }
    }
}
