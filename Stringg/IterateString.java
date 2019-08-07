package Stringg;

import java.util.Scanner;

public class IterateString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		for (int i = 0; i < num; i++) {
			int count = scan.nextInt();
			String S = scan.next();
			for (int j = 0; j < S.length(); j++) {
				for (int m = 0; m < count; m++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}

}
