import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = -1;

        while (true) {
            num = scanner.nextLong(); // 9    8
            if (num == 0) {
                break;
            }
            long res = (long) Math.sqrt(num); // 3    2
            System.out.println((res * res == num ? "yes" : "no"));
        }
    }
}
