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
        int N = in.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int n = in.nextInt();
            if (isPrime(n)) sum++;
        }
        System.out.println(sum);
    }
}