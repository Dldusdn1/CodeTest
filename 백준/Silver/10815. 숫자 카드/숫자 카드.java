import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] card = new int[N];
        HashSet<Integer> card_set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            card[i] = sc.nextInt();
            card_set.add(card[i]);
        }

        int M = sc.nextInt();
        int [] find = new int[M];
        for (int i = 0; i < M; i++) {
            find[i] = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < find.length; i++) {
            if (card_set.contains(find[i])) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }


    }
}
