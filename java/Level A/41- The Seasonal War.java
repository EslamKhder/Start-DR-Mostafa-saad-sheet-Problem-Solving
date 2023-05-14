package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int size;
    static char arr[][] = new char[30][30];
    static int visit[][] = new int[30][30];
    static int x[]= {0,0,-1,1,-1,-1,1,1};
    static int y[]= {1,-1,0,0,1,-1,1,-1};
    public static void main(String args[])  //static method
    {
        int testCase = 1;//2
        Scanner scanner = new Scanner(System.in);

        size = scanner.nextInt();//6

        while (scanner.hasNext()){
            if(testCase != 1){
                size = scanner.nextInt();//6
            }
            for (int i=0;i<size;i++) {
                String value = scanner.next();
                // 012345
                // 100100
                for (int z=0;z<size;z++) {
                    arr[i][z] = value.charAt(z);
                }
            }
            Arrays.stream(visit).forEach(a -> Arrays.fill(a, 0));
            int process = 0;
            for (int i=0;i<size;i++) {
                for (int z=0;z<size;z++) {
                    if(visit[i][z] == 0 && arr[i][z] == '1'){
                        cancel(i,z);
                        process++;
                    }
                }
            }
            System.out.println("Image number " + (testCase++) + " contains "+process+" war eagles.");
        }
    }

    public static boolean isValid(int row, int column){
        return row >= 0 && column >= 0 && row < size && column < size;
    }
    public static void cancel(int row, int column){ // 4 2
        if(visit[row][column] == 1){
            return;
        }
        visit[row][column] = 1;

        for (int i=0;i<8;i++) {
            int r = row + x[i]; // 4
            int c = column + y[i]; // 3

            if(isValid(r,c) && visit[r][c] == 0 && arr[r][c] == '1'){
                cancel(r,c);
            }
        }
    }

}
