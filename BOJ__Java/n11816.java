import java.util.Scanner;

public class n11816 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = 0;
        if (input.charAt(0) == '0' && input.charAt(1) == 'x') {
            // 16진수
            input = input.substring(2);
            result = Integer.parseInt(input, 16);
        } else if (input.charAt(0) == '0') {
            // 8진수
            input = input.substring(1);
            result = Integer.parseInt(input, 8);

        } else {
            // 10진수
            result = Integer.parseInt(input);
        }
        System.out.print(result);
    }
}
