import java.util.Scanner;

public class n16561 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int order = num/3-2;
        int sum = 0;
        for (int i=1;i<=order;i++){
            sum = sum + i;
        }
        System.out.print(sum);
    }
}
