import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        // 012345678
        // {a, b, c}     9
        Set<Character> letters = new HashSet();
        for(int i=0;i<value.length();i++){
            if(value.charAt(i) != '{' && value.charAt(i) != '}'
                    && value.charAt(i) != ' ' && value.charAt(i) != ','){
                letters.add(value.charAt(i));
            }
        }
        System.out.println(letters.size());
    }
}
