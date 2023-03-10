import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cakesNeed = scanner.nextInt();
        int t1 = scanner.nextInt();
        int cakesMake = scanner.nextInt();
        int t2 = scanner.nextInt();
        int res = (t1 + t2) / t1;
        if(res*cakesMake < cakesNeed){ // 12 < 8
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
