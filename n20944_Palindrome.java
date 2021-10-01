import java.util.Scanner;

public class n20944_Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char[] word = new char[num];
        if (num % 2 == 0) {
            for (int i = 0; i < num; i++) {
                word[i] = 'a';
            }
        } else {
            for (int i = 0; i < num; i++) {
                word[i] = 'a';
            }
            word[num / 2] = 'b';
        }
        String output = String.valueOf(word);
        System.out.println(output);
    }
}
