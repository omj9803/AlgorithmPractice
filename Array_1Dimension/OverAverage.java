package Array_1Dimension;

import java.util.Scanner;

public class OverAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			int student = scan.nextInt();
			int score[] = new int[student];
			int sum = 0;
			double count = 0;
			for (int j = 0; j < student; j++) {
				score[j] = scan.nextInt();
				sum = sum + score[j];
			}
			int average = sum / student;
			for (int m = 0; m < student; m++) {
				if (score[m] > average)
					count++;
			}
			System.out.printf("%.3f", count / student * 100);
			System.out.println("%");
		}
	}

}
