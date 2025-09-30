import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int N, M;
    public static int[] result;
    public static StringBuilder sb = new StringBuilder();

    public static void backtrack(int idx, int start) {
        if (idx == M) {
            for (int e : result)
                sb.append(e).append(" ");
            sb.append("\n");
            return;
        }
        for (int i = start; i <= N; i++) {
            result[idx] = i;
            backtrack(idx + 1, i + 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        //visited = new boolean[N+1];

        backtrack(0, 1);
        System.out.println(sb);
    }
}