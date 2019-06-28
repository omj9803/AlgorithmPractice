package Array_1Dimension;

import java.util.Scanner;

public class MultResult {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int result = a * b * c;
		int store[] = new int[50];
		int temp = 10, n = 0, zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0,
				nine = 0;

		while (true) {
			if (result == 0)
				break;
			store[n] = result % temp;
			result = result / 10;
			if (store[n] == 0)
				zero++;
			if (store[n] == 1)
				one++;
			if (store[n] == 2)
				two++;
			if (store[n] == 3)
				three++;
			if (store[n] == 4)
				four++;
			if (store[n] == 5)
				five++;
			if (store[n] == 6)
				six++;
			if (store[n] == 7)
				seven++;
			if (store[n] == 8)
				eight++;
			if (store[n] == 9)
				nine++;
			n++;
		}
		System.out.println(zero + "\n" + one + "\n" + two + "\n" + three + "\n" + four + "\n" + five + "\n" + six + "\n"
				+ seven + "\n" + eight + "\n" + nine);

	}

}