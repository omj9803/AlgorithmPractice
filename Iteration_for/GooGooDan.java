package Iteration_for;

import java.util.Scanner;

public class GooGooDan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + (a * i));
		}

	}

}
