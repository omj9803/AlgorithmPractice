import java.util.Scanner;

public class n11441 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + scanner.nextInt();
            array[i] = sum;
        }
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            int first = scanner.nextInt() - 1;
            int second = scanner.nextInt() - 1;
            if (first == 0)
                System.out.println(array[second]);
            else
                System.out.println(array[second] - array[first - 1]);
        }
    }
}

/*
* 시간초과 : 이중 for문으로 인해 시간초과가 나옴
* 배열에 저장 값을 입력값이 아닌 합으로 바꿈으로써
* for문을 하나만 사용, 해결
* */
