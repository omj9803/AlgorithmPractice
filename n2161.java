import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class n2161 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Queue<Integer> input = new LinkedList<>();
        Queue<Integer> output = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            input.add(i);
        }
        while (true) {
            if (input.size() == 1) {
                output.add(input.poll());
                break;
            }
            output.add(input.poll());
            input.add(input.poll());
        }
        for (int i = 1; i <= n; i++) {
            System.out.print(output.poll() + " ");
        }

    }
}
