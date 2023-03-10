import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            BigInteger bigInteger1 = new BigInteger(scanner.next());
            BigInteger bigInteger2 = new BigInteger(scanner.next());
            System.out.println(bigInteger1.multiply(bigInteger2));
        }
    }
}
