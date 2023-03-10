import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long steps = scanner.nextLong(); // 5
        Long ices = scanner.nextLong(); // 12 2 42 22
        long counter = 0; // 1
            /*
                + 5
                - 10
                - 20
                + 40
                - 20
             */
        while (steps != 0) { // 5 4 3 2 1
            char process = scanner.next().charAt(0); // + -
            Long icesNum = scanner.nextLong(); //
            if(process == '+'){
                ices+=icesNum;
            } else {
                if (ices >= icesNum) {
                    ices-=icesNum;
                } else {
                    counter++;
                }
            }
            steps--;
        }
        System.out.println(ices + " " + counter);
    }
}
