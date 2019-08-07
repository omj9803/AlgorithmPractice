package Array;

import java.util.Scanner;

public class NumberArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int number[] = new int[num];
		for (int i = 0; i < num; i++) {
			number[i] = scan.nextInt();
		}
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num - 1; i++) {
				if (number[i] > number[i + 1]) {
					int temp;
					temp = number[i];
					number[i] = number[i + 1];
					number[i + 1] = temp;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.println(number[i]);
		}
	}
}
