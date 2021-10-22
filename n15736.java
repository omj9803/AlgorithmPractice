import java.util.Scanner;

public class n15736 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 1;
        while(true){
            int temp = count*count;
            if(temp>num){
                break;
            }
            count++;
        }
        System.out.print(count-1);

    }
}
