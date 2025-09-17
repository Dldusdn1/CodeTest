import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int s = 2; //정사각형 한 변에 있는 점 개수
        int num = 0; //전체 개수
        for (int i= 0; i < N; i++) {
            s = s*2-1; //1번 반복할 때마다 점의 개수 변하는 규칙
        }
        num = s*s;
        System.out.println(num);
    }
}