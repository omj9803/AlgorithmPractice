package Array_1Dimension;

import java.util.Scanner;

public class maxValue {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int max = 0;
		int seq = 0;

		for (int i = 0; i < 9; i++) {
			a[i] = scan.nextInt();
		}

		for (int i = 0; i < 9; i++) {
			if (a[i] > max) {
				max = a[i];
				seq = i + 1;
			}
		}
		System.out.println(max + "\n" + seq);

	}

}
