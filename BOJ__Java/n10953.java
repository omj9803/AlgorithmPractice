import java.util.Scanner;

public class n10953 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < num; i++) {
            String numbers = scanner.nextLine();
            int a = Integer.parseInt(numbers.split(",")[0]);
            int b = Integer.parseInt(numbers.split(",")[1]);
            System.out.println(a + b);

        }
    }
}
