import java.util.Scanner;

public class n15873 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int secondNum = num % 10;
        int firstNum = num / 10;
        if(secondNum==0){
            secondNum = num%100;
            firstNum = num/100;
        }

        System.out.println(secondNum + firstNum);
    }
}
