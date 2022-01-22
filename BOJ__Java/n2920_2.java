// 2920. 음계를 입력받아 ascending인지 descending인지 mixed인지 판단
package Array_1Dimension;

import java.util.Scanner;

public class JangJo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[8];
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
			if (a[0] == 1 && a[1] == 2 && a[2] == 3 && a[3] == 4 && a[4] == 5 && a[5] == 6 && a[6] == 7 && a[7] == 8)
				System.out.println("ascending");
			else if (a[0] == 8 && a[1] == 7 && a[2] == 6 && a[3] == 5 && a[4] == 4 && a[5] == 3 && a[6] == 2
					&& a[7] == 1)
				System.out.println("descending");
			else
				System.out.println("mixed");

		}

	}

}
