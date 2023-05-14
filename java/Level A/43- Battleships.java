package com.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int size;//4
    static char arr[][] = new char[100][100];
    static int visit[][] = new int[100][100];

    public static void main(String args[])  //static method
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt(); // 2
        int cases = 1;
        while (testCases != 0) {// 2 1
            size = scanner.nextInt();
            for (int i=0;i<size;i++) {// 0 1
                String value = scanner.next();// ..x.
                for (int z=0;z<size;z++) {// 0 1 2 3
                    arr[i][z] = value.charAt(z);
                }
            }
            Arrays.stream(visit).forEach(a -> Arrays.fill(a, 0));
            int counter = 0;
            for (int i=0;i<size;i++) {// 0 1
                for (int z=0;z<size;z++) {// 0 1 2 3
                    if(arr[i][z] == 'x' && visit[i][z] == 0){
                        counter++;
                        run(i,z);
                    }
                }
            }
            System.out.println("Case " + (cases++) + ": " + counter);
            testCases--;
        }
    }

    public static boolean isValid(int x,int y){// 1 2
        return x >=0 && x<size && y >=0 && y <size;
    }
    public static void run(int x,int y){ // 1 2
        if(!isValid(x,y)){
            return;
        }
        if(visit[x][y] == 1 || arr[x][y] == '.'){
            return;
        }
        visit[x][y] = 1;

        run(x,y+1);
        run(x,y-1);
        run(x-1,y);
        run(x+1,y);

    }
}