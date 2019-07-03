package Function;

import java.util.Scanner;

public class HanSu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(hansu(n));

	}

	static int hansu(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if ((0 < i) && (i < 100)) {
				count++;
			} else {
				int bignum = i;
				int checkArray[] = new int[4];
				for (int j = 0; j < checkArray.length; j++) {
					checkArray[j] = bignum % 10;
					bignum = bignum / 10;
				}
				if (checkArray[1] - checkArray[0] == checkArray[2] - checkArray[1]) {
					if (checkArray[0] == 0 && checkArray[1] == 0 && checkArray[2] == 0)
						break;
					count++;
				}

			}

		}
		return count;
	}
}
