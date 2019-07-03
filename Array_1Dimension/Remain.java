package Array_1Dimension;

import java.util.Scanner;

public class Remain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[10];
		int remain[] = new int[42];
		int count = 0;

		for (int i = 0; i < 10; i++) {
			a[i] = scan.nextInt() % 42;
			remain[a[i]] = 1;
		}
		for (int i = 0; i < 42; i++) {
			if (remain[i] == 1)
				count++;
		}
		System.out.println(count);

	}

}
