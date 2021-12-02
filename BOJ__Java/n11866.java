import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        System.out.print("<");
        while (true) {
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll());
            }
            System.out.print(queue.poll());
            if(queue.size()==0){
                System.out.print(">");
                break;
            }
            System.out.print(", ");
        }
    }
}
