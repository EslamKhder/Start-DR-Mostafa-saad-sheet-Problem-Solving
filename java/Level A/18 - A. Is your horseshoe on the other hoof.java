import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class horseshoeontheotherhoof {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> colors = new HashSet(); // 7 7 7 7    // 7
        colors.add(scanner.nextInt());
        colors.add(scanner.nextInt());
        colors.add(scanner.nextInt());
        colors.add(scanner.nextInt());
        System.out.println(4 - colors.size()); // 4 - 1 = 3
    }
}
