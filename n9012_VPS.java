import java.util.Scanner;
import java.util.Stack;

public class n9012_VPS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] input = new String[num];
        for (int i = 0; i < num; i++) {
            input[i] = scanner.nextLine();
        }
        Loop :
        for (int i = 0; i < num; i++) {
            char[] vps = input[i].toCharArray();
            Stack stack = new Stack<>();
            for (int j = 0; j < vps.length; j++) {
                if (vps[j] == '(') {
                    stack.push(vps[j]);
                } else if (vps[j] == ')') {
                    if (stack.empty()) {
                        System.out.println("NO");
                        continue Loop;
                    }
                    stack.pop();
                }
            }
            if (!stack.empty()) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
