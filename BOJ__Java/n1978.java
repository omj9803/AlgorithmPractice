import java.util.Scanner;

public class n1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int answer = 0;
        int[] numbers = new int[num];
        // 입력받는 부분
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {
            int count = 2;
            while (true) {
                if(numbers[i]==1) break;
                if (numbers[i] == count) {
                    answer++;
                    break;
                }
                if (numbers[i] % count == 0) {
                    break;
                } else {
                    count++;
                }
            }
        }
        System.out.print(answer);

    }
}
