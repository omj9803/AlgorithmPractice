import java.util.Scanner;

public class D3_3431 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            int min = scanner.nextInt();
            int max = scanner.nextInt();
            int exercise = scanner.nextInt();
            int result = 0;
            if (exercise < min) {
                result = min - exercise;
            } else if (exercise > max) {
                result = -1;
            }
            System.out.println("#" + i + " " + result);
        }
    }
}
