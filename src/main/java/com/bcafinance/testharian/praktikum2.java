package com.bcafinance.testharian;
import java.util.Scanner;
/*
IntelliJ IDEA 2023.3.3 (Community Edition
Build #IC-233.14015.106, built on January 25, 2024
@Author hanzchristian a.k.a. Hanz Christian
Java Developer
Created on 19/02/24 18.59
@Last Modified 19/02/24 18.59
Version 1.0
*/

public class praktikum2 {
    public static void main(String[] args) {
        double input = 0;
        int total = 0;
        Scanner scn = new Scanner(System.in);

        try{
            while(true){
                input += scn.nextInt();
                total += 1;
            }
        }catch(Exception e){
            System.out.println(input/total);
        }

    }
}