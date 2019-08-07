package BrutePose;

import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = scan.nextInt();
		int card[] = new int[num];
		int max = 0, result = 0;

		for (int i = 0; i < num; i++) {
			card[i] = scan.nextInt();
		}
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				for (int k = 0; k < num; k++) {
					if (i != j && j != k && k != i) {
						int temp = card[i] + card[j] + card[k];
						if (temp <= sum && max < temp)
							result = temp;
					}
				}
			}
		}
		System.out.println(result);
	}
}
