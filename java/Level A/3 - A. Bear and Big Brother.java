package com.java;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int years = 0;
        while (b1 <= b2){
            b1 *=3;
            b2 *=2;
            years++;
        }
        System.out.println(years);
    }
}