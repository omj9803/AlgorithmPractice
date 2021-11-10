import java.util.Scanner;

public class n1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp1 = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp1;
                }
            }
        }
        System.out.print(numbers[0] * numbers[num - 1]);
    }
}
