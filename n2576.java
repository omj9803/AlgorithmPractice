import java.util.Scanner;

public class n2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 7;
        int count = 0;
        int idx = 0;
        int sum = 0;
        int min = 100;
        int[] odd = new int[num];
        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            if (n % 2 != 0) {
                count++;
                odd[idx] = n;
                idx++;
            }
        }
        idx = 0;
        if (count == 0) {
            System.out.println("-1");
        } else {
            while (idx < count) {
                sum = sum + odd[idx];
                if (min > odd[idx]) {
                    min = odd[idx];
                }
                idx++;
            }
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
