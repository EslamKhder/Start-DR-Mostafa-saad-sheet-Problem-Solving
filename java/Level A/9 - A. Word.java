import javax.xml.stream.events.Characters;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int lower = 0;  // sm
        int upper = 0; // ca
        for (Character c : word.toCharArray()) { // "abcd"   ['a' 'b' 'c' 'd']
            if(Character.isLowerCase(c)){
                lower++;
            } else {
                upper++;
            }
        }
        if(upper > lower){
            System.out.println(word.toUpperCase());
        } else {
            System.out.println(word.toLowerCase());
        }
    }
}
