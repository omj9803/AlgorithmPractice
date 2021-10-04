import java.util.Scanner;

public class n11399_ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        // 입력받은 수 차례로 배열에 저장
        for (int i = 0; i < num; i++) {
            numbers[i] = scanner.nextInt();
        }
        // 오름차순으로 정렬
        for (int i = 0; i < num; i++) {
            for (int j = i + 1; j < num; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        // 합 구하기
        int sum = 0;
        for (int i = 0; i < num; i++) {
            int tempSum = 0;
            for (int j = 0; j <= i; j++) {
                tempSum = tempSum + numbers[j];
            }
            sum = sum + tempSum;
        }
        System.out.print(sum);
    }
}
