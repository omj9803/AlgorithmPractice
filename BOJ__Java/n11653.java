import java.util.Scanner;

public class n11653 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 2;
        while (true) {
            if (num % count == 0) {
                num = num / count;
                System.out.println(count);
            } else {
                count++;
            }
            if (num == 1) {
                break;
            }
        }
    }
}
