import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            String value = sc.next();
            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, value);
            }
        }

        ArrayList<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Collections.reverseOrder());
        for (String key : list) {
            System.out.println(key);
        }


    }
}
