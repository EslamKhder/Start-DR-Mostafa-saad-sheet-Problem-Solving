import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 4
        int [] arr = new int[size]; // [    ]
        for (int i=0;i<size;i++){ // 0 1 2 3
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<size;i++){ // 0 1 2 3
            System.out.print(arr[i] + " ");
        }
    }
}
