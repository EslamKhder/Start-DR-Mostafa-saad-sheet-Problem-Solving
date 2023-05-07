import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] argv)
    {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        if(size < 26){ // 25
            System.out.println("NO");
            return;
        }
        String value = scanner.next().toLowerCase(); //
        int cou = 0;
        for (int i = 97;i<=122;i++){
            if (value.contains(((char)i)+"")){ // c + "" = "c"
                cou++;
            }
        }
        if (cou == 26){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//        Arrays.sort(value.toCharArray());
//        int cou = 0;
//        for (int i=0;i<size;i++){// "wee"
//            if(value.charAt(i) != value.charAt(i + 1)){
//                cou++;
//            }
//        }
//        if (cou == 26){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }
}
