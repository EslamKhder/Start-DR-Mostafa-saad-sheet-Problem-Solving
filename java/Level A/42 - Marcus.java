package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static String word = "IEHOVA#";
    static String steps [] = {"right","left","forth"};
    static int x [] = {0,0,-1};
    static int y [] = {1,-1,0};
    static int row = 0;
    static int column = 0;
    public static void main(String args[])  //static method
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        while (testCases != 0){ // 2 1

            row = scanner.nextInt();
            column = scanner.nextInt();

            int r1 = 0,r2=0,c1=0,c2=0;
            char arr[][] = new char[row][column];
            for (int i=0;i<row;i++){ // 6
                String value = scanner.next(); // "PST#T"
                for (int z=0;z<column;z++){//5   // 0 1 2 3 4
                    arr[i][z] = value.charAt(z);
                    if(arr[i][z] == '@'){
                        r1 = i; // 5 0
                        c1 = z; // 1 3
                    }

                    if(arr[i][z] == '#'){
                        r2 = i;// 0
                        c2 = z;// 3
                    }
                }
            }

            int index = 0; // 7
            List<String> res = new ArrayList<>();
            while (r1 != r2 || c1 != c2) {//

                for(int i=0;i<3;i++){ // 0 1 2
                    int newX = r1 + x[i];
                    int newY = c1 + y[i];
                    if(inValid(newX,newY) && index < word.length() && arr[newX][newY] == word.charAt(index)){
                        r1 = newX; //
                        c1 = newY; //
                        index++;
                        res.add(steps[i]);
                    }
                }
            }
            System.out.print(res.get(0));
            for (int i=1;i<res.size();i++){
                System.out.print(" " + res.get(i));
            }
            System.out.println();

            testCases--;
        }
    }
    public static boolean inValid(int rowIn,int columnIn){ // 4,5
        return rowIn >=0 && columnIn >=0 && rowIn < row && columnIn < column;
    }

}