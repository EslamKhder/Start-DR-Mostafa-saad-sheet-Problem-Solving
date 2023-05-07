import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 5
        int arr[]= new int[size]; // 6 5 1 3 2
        for (int i=0;i<size;i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        // 0 1 2 3 4
        // 1 2 3 5 6
        int counter = 0;
        for (int i=1;i<size-1;i++){ // i < 4
            if(arr[i] > arr[0] && arr[i] < arr[size -1]) counter++;
        }
        System.out.println(counter);
    }
}
