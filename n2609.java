import java.util.Scanner;

public class n2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int min = 0;
        int max = 0;
        int a = num1;
        int b = num2;
        if (num2 > num1) {
            a = num2;
            b = num1;
        }
        while (true) {
            int c = a % b;
            if (c == 0) {
                min = b;
                break;
            }
            if (b % c == 0) {
                min = c;
                break;
            }
            a = b;
            b = c;
        }
        max = (num1 * num2) / min;
        System.out.println(min);
        System.out.println(max);

    }
}
