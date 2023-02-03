import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value1 = scanner.next().toLowerCase(); // abcdefg                      //        "aaaa"
        String value2 = scanner.next().toLowerCase(); // "AbCdEfF"  // "abcdeff"     // "aaaA"  "aaaa"
        for (int i=0;i<value1.length();i++) {
            char c1 = value1.charAt(i);
            char c2 = value2.charAt(i);
            if(c1 < c2){
                System.out.println(-1);
                return;
            } else if(c2 < c1){
                System.out.println(1);
                return;
            }
        }
        System.out.println(0);
    }
}
