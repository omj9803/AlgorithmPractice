package Iteration_for;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int x = 1; x <= num; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}