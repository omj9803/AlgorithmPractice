// 2920. 음계를 입력받아 ascending인지 descending인지 mixed인지 판단
package Array_1Dimension;

import java.util.Scanner;

public class JangJo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[8];
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			if (i >= 1) {
				if (a[0] == 1 && a[i] == a[i - 1] + 1) {
					answer = 1;
				} else if (a[0] == 8 && a[i] == a[i - 1] - 1) {
					answer = 2;
				} else
					answer = 0;
			}
		}
		if (answer == 0)
			System.out.println("mixed");
		else if (answer == 1)
			System.out.println("ascending");
		else if (answer == 2)
			System.out.println("descending");

	}

}
