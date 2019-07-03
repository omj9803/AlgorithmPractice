package Function;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(factorial(n));

	}

	static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}

}
