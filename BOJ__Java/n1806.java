import java.util.Scanner;

public class n1806 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int sum = 0;
        int right = 0;
        int left = 0;
        int result = Integer.MAX_VALUE;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        while (true) {
            if (sum >= s) {
                sum -= numbers[left];
                result = Math.min(result, (right - left));
                left++;
            } else if (right == n) break;
            else {
                sum += numbers[right++];
            }
        }
        if (result == Integer.MAX_VALUE) System.out.println("0");
        else System.out.println(result);
    }
}
