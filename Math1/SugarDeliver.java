package Math1;

import java.util.Scanner;

public class SugarDeliver {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num % 5 == 0) {
			System.out.println(num / 5);
			return;

		} else {
			int tempnum = num;
			for (int i = 1; i <= num/5; i++) {
				tempnum = tempnum - 5;
				if (tempnum % 3 == 0) {
					System.out.println(i + tempnum / 3);
					return;
				}
			}
		}
		if (num % 3 == 0) {
			System.out.println(num / 3);
		} else
			System.out.println("-1");
	}
}
