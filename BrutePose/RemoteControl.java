package BrutePose;

import java.util.Scanner;

public class RemoteControl {
    static boolean[] broken = new boolean[10]; // ��ư�� ������ ������ true, �ƴϸ� false
    public static int canMove(int channel) { // �����ϸ� ���� ���̸� ����, �Ұ����ϸ� 0�� ����
        int length = 0;
 
        if ( channel == 0 ) {
            return broken[0] ? 0 : 1;
        }
 
        while ( channel > 0 ) {
            if ( broken[channel % 10] ) {
                return 0;
            }
            length += 1;
            channel /= 10;
        }
        return length;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
 
        for (int i = 0; i < m; i++) {
            broken[scanner.nextInt()] = true; // ��ư�� ������ ������ true, �ƴϸ� false
        }
 
        /** 100���� n���� ���� ��ư�� ������ �ʰ�, +�� -���� ������ �̵��ϴ� �ڵ� */
        int answer = n - 100; // n >= 100
        if (answer < 0) {
            answer = -answer; // n < 100
        }
 
        /** �̵��� ä�� c�� ������ ����, �����ϸ�, ��ư�� �� ��� ������ �ϴ��� */
        for (int i = 0; i <= 1000000; i++) { // ���� ��ư���� �̵��ϴ� ä��
        int c = i;
        int length = canMove(c); // ���̸� ���.
        if (length > 0) {
            int press = c - n; // +�� -�� �� �� ������ �ϴ��� ���
            if (press < 0) {
                press = -press; // +�� ������ ���
            }
            if (answer > length + press) {
                answer = length + press;
            }
        }
    }
        System.out.println(answer);
    }
 
 
 
}