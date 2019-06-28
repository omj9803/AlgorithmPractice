// 8958. OX퀴즈 점수계산
package Array_1Dimension;

import java.util.Scanner;

public class OXQuiz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = scan.nextInt();

		for (int i = 0; i < cnt; i++) {
			String OX = scan.next();
			String[] arrayOX = new String[OX.length()];
			int[] arrayScore = new int[OX.length()];
			arrayOX = OX.split("");

			for (int j = 0; j < arrayOX.length; j++) {
				if (arrayOX[j].equals("O")) {
					if (j == 0)
						arrayScore[j] = 1;
					else {
						int temp = arrayScore[j - 1];
						arrayScore[j] = ++temp;
					}
				} else {
					arrayScore[j] = 0;
				}
			}

			int sum = 0;
			for (int k = 0; k < arrayOX.length; k++) {
				sum = sum + arrayScore[k];
			}
			System.out.println(sum);

		}
	}

}
