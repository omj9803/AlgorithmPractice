import java.util.Scanner;

public class n2455 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int out = scanner.nextInt();
            int in = scanner.nextInt();

            sum = sum - out;
            sum = sum + in;
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
