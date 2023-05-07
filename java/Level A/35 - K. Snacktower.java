import java.util.Scanner;

public class Main {
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 3    1 2 3
        int max = size; // 3 2 1 0
        int arr[] = new int[size+1];
        //  0 1 2 3
        // [0 1 1 1]    3 1 2
        for (int i=0;i<size;i++){ // 0 1 2
            int num = scanner.nextInt(); // 3 1 2
            arr[num] = 1;
            while (arr[max] == 1){
                System.out.print(max + " ");
                max--;
            }
            System.out.println();
        }
        /*
        3

        2 1
        * */
    }
}
