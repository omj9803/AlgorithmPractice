import java.util.Scanner;

public class n3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] point = new int[3][2];
        for (int i = 0; i < 3; i++) {
            point[i][0] = scanner.nextInt();
            point[i][1] = scanner.nextInt();
        }
        int x = 0;
        int xpoint = point[0][0];
        if (xpoint != point[1][0]) {
            if (xpoint != point[2][0]) {
                x = xpoint;
            } else {
                x = point[1][0];
            }
        } else {
            x = point[2][0];
        }

        int y = 0;
        int ypoint = point[0][1];
        if (ypoint != point[1][1]) {
            if (ypoint != point[2][1]) {
                y = ypoint;
            } else {
                y = point[1][1];
            }
        } else {
            y = point[2][1];
        }
        System.out.print(x + " " + y);
    }
}
