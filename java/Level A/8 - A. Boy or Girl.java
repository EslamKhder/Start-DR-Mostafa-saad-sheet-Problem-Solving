import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Set<Character> letters = new HashSet();
        for (Character c: name.toCharArray()){ // "eslam"   //  ['e' 'a' 'l' 'a' 'm']
            letters.add(c);
        }
        if(letters.size() % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

    }
}
