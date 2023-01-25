package com.java;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int teams = scanner.nextInt(); // 3
        int counter = 0;
        while (teams != 0){ // 3 2 1
            int p1 = scanner.nextInt();
            int p2 = scanner.nextInt();
            int p3 = scanner.nextInt();

            if((p1 + p2 + p3) >= 2){
                counter++;
            }
            teams--;
        }
        System.out.println(counter);
    }
}