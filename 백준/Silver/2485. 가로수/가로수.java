import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] tree = new int[N];
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
        }

        BigInteger gcd = BigInteger.valueOf(0);
        for (int i = 0; i < N - 1; i++) {
            int dis = tree[i + 1] - tree[i];
            BigInteger distance = BigInteger.valueOf(dis);
            gcd = distance.gcd(gcd);
        }

        int result = (tree[N - 1] - tree[0]) / gcd.intValue() - tree.length + 1;
        System.out.println(result);

    }
}
