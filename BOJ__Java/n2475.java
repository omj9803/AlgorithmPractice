import java.util.Scanner;

public class n2475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            sum = sum + num * num;
        }
        sum = sum % 10;
        System.out.println(sum);
    }
}
