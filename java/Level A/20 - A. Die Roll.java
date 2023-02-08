import java.util.Scanner;

public class DieRoll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(); // 4
        int num2 = scanner.nextInt(); // 2
        int count = 6 - Math.max(num1,num2) + 1;
        String []arr = {"1/1","5/6","2/3","1/2","1/3","1/6"};
        // 1 2 3 4 5 6
        // 6 5 4 3 2 1
        System.out.println(arr[6-count]); // 5 / 2 = 2.5
        // 6 / 6     5 / 6   4 / 6   3 / 6   2 / 6    1 /6
    }
}
