import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 2
        int orangeSize = scanner.nextInt();
        int max = scanner.nextInt(); // 10
        int sum = 0;
        int counter = 0;
        while (size != 0) { //2 1
            int orange = scanner.nextInt();
            if(orange<=orangeSize){
                sum+=orange; // 6 7 = 0
            }
            if(sum > max){
                counter++;
                sum =0;
            }
            size--;
        }
        System.out.println(counter);
    }
}
