import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        
        int min_x = Math.min(x, w-x);
        int min_y = Math.min(y, h-y);

        System.out.println(Math.min(min_x, min_y));

    }
}