package Stringg;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String addnum = scan.next();
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + (addnum.charAt(i) - '0');
		}
		System.out.println(sum);

	}
}
