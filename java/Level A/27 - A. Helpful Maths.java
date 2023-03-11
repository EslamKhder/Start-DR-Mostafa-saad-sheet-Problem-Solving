import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String eq = scanner.next();/// "3+2+1"
        // 01234
        //"3+2+1"
        char arr[] = eq.replace("+","").toCharArray();// "321" ==> ['3','2','1']
        Arrays.sort(arr);// ['1','2','3']
        for (int i=0;i<arr.length;i++){// 0 1 2
            System.out.print(arr[i]);
            if(!(i == arr.length - 1)){
                System.out.print("+");
            }
        }
    }
}
