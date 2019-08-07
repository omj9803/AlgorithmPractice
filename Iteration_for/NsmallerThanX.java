package Iteration_for;

import java.util.Scanner;

public class NsmallerThanX {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();

		for (int i = 0; i < N; i++) {
			int a = scan.nextInt();
			if (X > a)
				System.out.print(a + " ");
		}

	}

}
