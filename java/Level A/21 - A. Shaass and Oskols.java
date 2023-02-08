import java.util.Scanner;

public class Shaas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeBox = scanner.nextInt();//3
        int [] arr1 = new int[sizeBox]; // 2 4 1
        for (int i=0;i<sizeBox;i++) {
            arr1[i] = scanner.nextInt();
        }
        int sizeBoxKill = scanner.nextInt(); // 1
        int boxNum = 0;
        int num = 0;
        for (int i=0;i<sizeBoxKill;i++){ // 0
            boxNum = scanner.nextInt(); // 2
            num = scanner.nextInt();//2
            if (boxNum != 1) {
                arr1[boxNum - 2] += num - 1;
            }
            if (boxNum != sizeBox) {
                arr1[boxNum] += arr1[boxNum - 1] - num;
            }
            arr1[boxNum - 1] = 0;
        }
        for (int i=0;i<sizeBox;i++){ // 0
            System.out.println(arr1[i]);
        }
    }
}
