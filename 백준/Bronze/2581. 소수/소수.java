import java.util.Scanner;

public class Main {
    public static boolean isPrime(int n) { //소수 판별 함수
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int sum = 0;
        int num = 0;
        int min = 0;

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum+=i;
                num++;
                if (num == 1) min = i;
            }
        }

        if (num != 0) {
            System.out.println(sum);
            System.out.println(min);
        }
        else System.out.println("-1");

    }
}