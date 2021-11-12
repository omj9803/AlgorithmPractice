import java.util.Scanner;

public class n10984 { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            int subjects = scanner.nextInt();
            int sum = 0;
            double avg = 0;
            for (int j = 0; j < subjects; j++) {
                int sub = scanner.nextInt();
                double score = scanner.nextDouble();
                sum = sum + sub;
                avg = avg + (sub * score);
            }
            System.out.print(sum + " ");
            System.out.print(String.format("%.1f", avg/sum));
            System.out.println();
        }
    }
}
