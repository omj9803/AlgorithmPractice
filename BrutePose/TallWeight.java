package BrutePose;

import java.util.Scanner;

public class TallWeight {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int body[][] = new int[num][2];
		int grade[] = new int[num];

		for (int i = 0; i < num; i++) {
			grade[i] = 1;
			body[i][0] = scan.nextInt();
			body[i][1] = scan.nextInt();
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (body[i][0] > body[j][0] && body[i][1] > body[j][1]) {
					grade[j]++;
				}
			}
		}
		for (int i = 0; i < num; i++) {
			System.out.print(grade[i] + " ");
		}
	}
}