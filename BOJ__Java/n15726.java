import java.util.Scanner;

public class n15726 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        int result1 = (int)(a * b / c);
        int result2 = (int)(a / b * c);
        if (result1 > result2) {
            System.out.print(result1);
        } else {
            System.out.print(result2);
        }
    }
}
