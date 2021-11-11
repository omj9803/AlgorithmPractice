import java.util.Scanner;

public class n1085 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int min = 0;
        if (h - y > w - x) {
            min = w - x;
        } else {
            min = h - y;
        }
        if (x > y) {
            if (min > y) min = y;
        } else {
            if (min > x) min = x;
        }
        System.out.println(min);
    }
}
