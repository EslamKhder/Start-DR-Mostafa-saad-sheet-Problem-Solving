import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt(); // 7
        List team1 = new ArrayList();// 1 1 1   3
        List team2 = new ArrayList();// 2 2     2
        List team3 = new ArrayList();// 3 3     2

        for (int i=1;i<=size;i++) { // 1 2 3 4 5 6 7
            int num = scanner.nextInt();
            // 1 2 3 4 5 6 7
            // 1 3 1 3 2 1 2
            if(num == 1){
                team1.add(i);
            } else if (num == 2) {
                team2.add(i);
            } else {
                team3.add(i);
            }
        }
        int teamSize = Math.min(team3.size(),Math.min(team1.size(),team2.size()));//2
        System.out.println(teamSize);
        for (int i=0;i<teamSize;i++){
            System.out.println(team1.get(i) + " " + team2.get(i) + " " + team3.get(i));
        }
    }
}
