import java.util.Scanner;

public class n11047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] coin = new int[num];
        int count = 0;
        int idx = 0;
        for (int i = num - 1; i >= 0; i--) {
            coin[i] = scanner.nextInt();
        }
        while (idx < num) {
            if (sum >= coin[idx]) {
                sum = sum - coin[idx];
                count++;
            } else {
                idx++;
            }
        }
        System.out.println(count);
    }
}
