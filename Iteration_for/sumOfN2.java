// 8393��. n�� �־����� �� 1���� n���� �� ���ϴ� ���α׷�
package Iteration_for;

import java.util.Scanner;

public class sumOfN2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = i + sum;
		}
		System.out.println(sum);
	}

}
