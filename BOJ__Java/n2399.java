import java.util.Scanner;

public class n2399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] dots = new int[num];
        for (int i = 0; i < num; i++) {
            dots[i] = scanner.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (dots[i] - dots[j] < 0){
                    sum = sum - (dots[i] - dots[j]);
                }
                else
                    sum = sum + (dots[i] - dots[j]);
            }
        }
        System.out.print(sum);
    }
}
