import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class n1158_Josephus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(josephus(n, k));
    }

    public static StringBuilder josephus(int n, int k) {
        Queue numbers = new LinkedList();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(numbers.size()>1){
            for(int i=0;i<k-1;i++){
                int value = (int)numbers.poll();
                numbers.offer(value);
            }
            sb.append(numbers.poll()).append(", ");
        }
        sb.append(numbers.poll()).append(">");

        return sb;
    }
}
