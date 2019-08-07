package BrutePose;

import java.util.Scanner;

public class MovieDirector {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;

		while (num > 0) {
			count++;
			String S = Integer.toString(count);
			if (S.contains("666"))
				num--;
		}
		System.out.println(count);

	}
}
