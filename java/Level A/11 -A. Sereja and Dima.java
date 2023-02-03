import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardSize = scanner.nextInt();
        int arr[] = new int[cardSize];
        for (int i=0;i<cardSize;i++){
            arr[i] = scanner.nextInt();
        }
        int player1 = 0;
        int player2 = 0;
        int playerFlag = 0; // 0 1 2 3 4 5
        int start = 0;
        int end = cardSize - 1;
        int max = 0;
        while (start <= end) {
            if(arr[start] > arr[end]){
                max = arr[start];
                start++;
            } else {
                max= arr[end];
                end--;
            }
            if(playerFlag % 2 == 0){
                player1 += max;
            } else {
                player2 +=  max;
            }
            playerFlag++;
        }
        System.out.println(player1 + " " + player2);

    }
}
