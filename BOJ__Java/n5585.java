import java.util.Scanner;

public class n5585 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int answer = 1000 - value;
        int count = 0;
        while (answer >= 500) {
            answer = answer - 500;
            count++;
        }
        while (answer >= 100) {
            answer = answer - 100;
            count++;
        }
        while (answer >= 50) {
            answer = answer - 50;
            count++;
        }
        while (answer >= 10) {
            answer = answer - 10;
            count++;
        }
        while (answer >= 5) {
            answer = answer - 5;
            count++;
        }
        while (answer >= 1) {
            answer = answer - 1;
            count++;
        }
        System.out.println(count);

    }
}
