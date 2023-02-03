import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 6
        int start = size;
        int counter = 1;
        String temp = null;
        while (size != 0) { // 6 5 4 3 2 1
            String value = scanner.next();
            // "10" "10" "10" "01" "10" "10"
            if(size == start){
                temp = value;
                size--;
                continue;
            }
            if(temp.charAt(1) == value.charAt(0)){
                counter++;
            }
            temp = value;
            size--;
        }
        System.out.println(counter);
    }
}
