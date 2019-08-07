// 두번째로 큰 수가 무엇인지 출력하라
package Condition;

import java.util.Scanner;

public class WhatIsSecondBig {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		// 20 30 10
		if (a > b) {
			if (a > c) {
				if (b > c)
					System.out.println(b);
				else
					System.out.println(c);
			} else
				System.out.println(a);

		} else {
			if (a < c) {
				if (b < c)
					System.out.println(b);
				else
					System.out.println(c);
			} else
				System.out.println(a);
		}

	}

}
