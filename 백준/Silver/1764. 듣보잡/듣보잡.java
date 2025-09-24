import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        HashSet<String> hear = new HashSet<>();
        ArrayList<String> see = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            hear.add(sc.next());
        }
        for (int i = 0; i < M; i++) {
            String s = sc.next();
            if (hear.contains(s)) {
                see.add(s);
            }
        }

        Collections.sort(see);
        System.out.println(see.size());
        for (String s : see) {
            System.out.println(s);
        }



    }
}
