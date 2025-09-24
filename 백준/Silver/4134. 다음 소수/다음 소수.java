import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 배열을 long 타입으로 선언하는 것이 더 안전할 수 있습니다.
        long[] arr = new long[N]; 

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        for (int i = 0; i < N; i++) {
            long num = arr[i];
            
            // 2보다 작은 수(음수, 0, 1)에 대한 예외 처리
            if (num < 2) {
                System.out.println(2);
                continue; // 다음 숫자로 넘어감
            }

            BigInteger a = BigInteger.valueOf(num);
            if (a.isProbablePrime(10)) {
                System.out.println(a);
            } else {
                System.out.println(a.nextProbablePrime());
            }
        }

        sc.close();
    }
}