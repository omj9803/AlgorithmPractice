import java.util.Scanner;

public class n23348 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oneHandCodingScore = scanner.nextInt();
        int noLookCodingScore = scanner.nextInt();
        int phoneCodingScore = scanner.nextInt();
        int crewNum = scanner.nextInt();
        int max = 0;
        for (int i = 0; i < crewNum; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                sum = sum + ((a * oneHandCodingScore) + (b * noLookCodingScore)
                        + (c * phoneCodingScore));

            }
            if (max < sum) max = sum;
        }
        System.out.println(max);
    }
}
