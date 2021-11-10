import java.util.Scanner;

public class n1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); 
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (a[i] > a[j]) {
                    int temp1 = a[i];
                    a[i] = a[j];
                    a[j] = temp1;
                }
                if (b[i] < b[j]) {
                    int temp2 = b[i];
                    b[i] = b[j];
                    b[j] = temp2;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum = sum + (a[i] * b[i]);
        }
        System.out.print(sum);

    }
}
