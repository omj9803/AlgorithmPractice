package Iteration_for;

import java.util.Scanner;

public class AaddB3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a + b));
		}

	}

}