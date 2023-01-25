package com.java;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1;i<=5;i++) { // 1 2 3 4 5
            for (int z = 1;z<=5;z++){ // 1 2 3 4 5
                int num = scanner.nextInt();
                if(num == 1){
                    System.out.println(Math.abs(i - 3) + Math.abs(z - 3));
                    return;
                }
            }
        }
    }
}