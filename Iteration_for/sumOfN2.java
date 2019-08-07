// 8393번. n이 주어졌을 때 1부터 n까지 합 구하는 프로그램
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
