import java.util.Scanner;

public class Main {
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 4

        int min = 0;
        int max = 0;

        int arr[] = new int[size];

        for (int i=0;i<size;i++){
            // 0  1  2 3
            //[-5 -2 2 7]
            arr[i] = scanner.nextInt();
        }
        for (int i=0;i<size;i++){
            if(i == 0){
                min = Math.abs(arr[i] - arr[i+1]);
                max = Math.abs(arr[i] - arr[size-1]);
            } else if(i == size -1) { // i=3
                min = Math.abs(arr[i] - arr[i-1]);
                max = Math.abs(arr[i] - arr[0]);
            } else {
                min = Math.min(Math.abs(arr[i] - arr[i-1]) , Math.abs(arr[i] - arr[i+1]));
                max = Math.max(Math.abs(arr[i] - arr[size - 1]),Math.abs(arr[i] - arr[0]));
            }
            System.out.println(min + " " + max);
        }


    }
}
