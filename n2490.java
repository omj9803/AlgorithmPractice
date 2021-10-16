import java.util.Scanner;

public class n2490 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                int num = scanner.nextInt();
                if (num == 1) count++;
            }
            if (count == 0) System.out.println("D");
            else if (count == 1) System.out.println("C");
            else if (count == 2) System.out.println("B");
            else if (count == 3) System.out.println("A");
            else if (count == 4) System.out.println("E");
        }
    }
}
