import java.util.Scanner;

public class n1284 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            int answer = 0;
            if (num == 0) break;
            String nbr = String.valueOf(num);
            char[] input = nbr.toCharArray();
            answer = input.length + 1;
            for (int i = 0; i < input.length; i++) {
                if (input[i] == '1') {
                    answer = answer + 2;
                } else if (input[i] == '0') {
                    answer = answer + 4;
                } else {
                    answer = answer + 3;
                }
            }
            System.out.println(answer);
        }
    }
}
