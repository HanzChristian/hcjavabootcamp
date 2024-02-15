package com.bcafinance.testharian;
import java.util.Scanner;

/*
IntelliJ IDEA 2023.3.3 (Community Edition
Build #IC-233.14015.106, built on January 25, 2024
@Author hanzchristian a.k.a. Hanz Christian
Java Developer
Created on 15/02/24 16.22
@Last Modified 15/02/24 16.22
Version 1.0
*/

public class praktikum1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //Make object scanner
        System.out.println("Masukkan Kata:");
        String input = scn.nextLine();  //Get input from user
        scn.close(); //Close scanner after used

        int output = 0; //Initialize output
        for (int i = 0; i < input.length(); i++) { //loop based on length
            char ch = input.charAt(i); //Initialize char based on user input per i
            int val = ch; //change char into integer to check ASCII
            if(val < 97) { //check ASCII value < 97
                output += val; //Add the value to output
            }
        }

        System.out.println("Hasil: " + output); //Print the output
    }
}



