package Stringg;

import java.util.Scanner;

public class CroatiaAlphabat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int count = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.contains("c=")) {
				S = S.replaceFirst("c=", "*");
				count++;
			}
			if (S.contains("c-")) {
				S = S.replaceFirst("c-", "*");
				count++;
			}
			if (S.contains("dz=")) {
				S = S.replaceFirst("dz=", "*");
				count++;
			}
			if (S.contains("d-")) {
				S = S.replaceFirst("d-", "*");
				count++;
			}
			if (S.contains("nj")) {
				S = S.replaceFirst("nj", "*");
				count++;
			}
			if (S.contains("lj")) {
				S = S.replaceFirst("lj", "*");
				count++;
			}
			if (S.contains("s=")) {
				S = S.replaceFirst("s=", "*");
				count++;
			}
			if (S.contains("z=")) {
				S = S.replaceFirst("z=", "*");
				count++;
			}

			if (97 <= S.charAt(i) && S.charAt(i) <= 122) {
				count++;
			}
		}

		System.out.println(count);
	}

}
