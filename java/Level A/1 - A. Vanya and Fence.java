package com.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = scanner.nextInt(); // 3
        int wall = scanner.nextInt(); // 7
        int result = 0;
        while (persons != 0){ // 3 2 1 0
            int tallPerson = scanner.nextInt();
            result++;
            if (tallPerson > wall) {
                result++;
            }
            persons--;
        }
        System.out.println(result);
    }
}