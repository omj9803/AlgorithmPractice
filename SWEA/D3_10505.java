import java.util.Scanner;

public class D3_10505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();
            int[] testCase = new int[num];
            int sum = 0;
            for (int j = 0; j < num; j++) {
                testCase[j] = scanner.nextInt();
                sum = sum + testCase[j];
            }
            int avg = sum / num;
            int count = 0;
            for (int j = 0; j < num; j++) {
                if (testCase[j] <= avg) {
                    count++;
                }
            }
            System.out.println("#" + i + " " + count);
        }
    }
}
