import java.util.Scanner;

public class buyshovel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        int coin = scanner.nextInt();
        int counter = 0;
        int res = 0;
        while (true) {
            counter++; //1
            res = counter * price; // 1 * 50 = 50
            if(res % 10 == 0 || res % 10 == coin){
                break;
            }
        }
        System.out.println(counter);
    }
}
