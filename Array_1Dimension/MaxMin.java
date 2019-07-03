package Array_1Dimension;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int a[] = new int[count];

		for (int i = 0; i < count; i++) {
			int num = scan.nextInt();
			a[i] = num;
		}
		int max = a[0], min = a[0];
		for (int i = 0; i < count; i++) {
			if (a[i] > max)
				max = a[i];
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(min + " " + max);

	}

}