import java.util.Scanner;

public class n1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        int[] alphabet = new int[26];
        String result = "";
        for (int i = 0; i < num; i++) {
            char firstName = scanner.nextLine().charAt(0);
            alphabet[firstName - 97]++;
        }
        for (int i = 0; i < alphabet.length; i++) {
            if (alphabet[i] >= 5) {
                char alpha = (char) (i + 97);
                result = result + alpha;
            }
        }
        if (result.equals(""))
            System.out.println("PREDAJA");
        else
            System.out.println(result);
    }
}
