// 1���� N���� ���ٿ� �ϳ��� ���
// N���� 1���� ���ٿ� �ϳ��� ���
package Iteration_for;

import java.util.Scanner;

public class Nprint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

//		for (int i = 1; i <= n; i++) {
//			System.out.println(i);
//		}

		for (int i = n; i > 0; i--) {
			System.out.println(i);
		}
	}

}
