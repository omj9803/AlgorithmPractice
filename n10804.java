import java.util.Scanner;

public class n10804 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < 10; i++) {
            int front = scanner.nextInt() - 1;
            int back = scanner.nextInt() - 1;
            int idx = back;
            int count = (back - front + 1) / 2;
            for (int j = front; count > 0 / 2; j++) {
                int temp = numbers[j];
                numbers[j] = numbers[idx];
                numbers[idx] = temp;
                idx--;
                count--;
            }
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
