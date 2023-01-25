package com.java;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 6
        String value = scanner.next();
        // 012345
        // ADAAAA
        int anton = 0;
        int danik = 0;
        for (int i=0;i<size;i++){ // 0 5
            if(value.charAt(i) == 'A'){
                anton++;
            } else {
                danik++;
            }
        }
        if(anton > danik){
            System.out.println("Anton");
        } else if (danik > anton){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}