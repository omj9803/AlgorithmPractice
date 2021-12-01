import java.util.Scanner;

public class n4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int[] sort = new int[3];
            if (a >= b) {
                if (a >= c) {
                    sort[0] = a;
                    sort[1] = b;
                    sort[2] = c;
                } else {
                    sort[0] = c;
                    sort[1] = b;
                    sort[2] = a;
                }
            } else {
                if (b >= c) {
                    sort[0] = b;
                    sort[1] = a;
                    sort[2] = c;
                } else {
                    sort[0] = c;
                    sort[1] = a;
                    sort[2] = b;
                }
            }
            if (sort[0] * sort[0] == sort[1] * sort[1] + sort[2] * sort[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}
