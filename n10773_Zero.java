import java.util.Scanner;
import java.util.Stack;

public class n10773_Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Stack stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int number = scanner.nextInt();
            if (number == 0) {
                stack.pop();
                continue;
            }
            stack.push(number);
        }
        while (!stack.empty()) {
            sum = sum + (int) stack.pop();
        }
        System.out.println(sum);
    }
}
