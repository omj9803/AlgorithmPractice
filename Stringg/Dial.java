package Stringg;

import java.util.Scanner;

public class Dial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		int result = 0;
		for (int i = 0; i < S.length(); i++) {
			if ('A' <= S.charAt(i) && S.charAt(i) <= 'C')
				result = result + 3;
			else if ('D' <= S.charAt(i) && S.charAt(i) <= 'F')
				result = result + 4;
			else if ('G' <= S.charAt(i) && S.charAt(i) <= 'I')
				result = result + 5;
			else if ('J' <= S.charAt(i) && S.charAt(i) <= 'L')
				result = result + 6;
			else if ('M' <= S.charAt(i) && S.charAt(i) <= 'O')
				result = result + 7;
			else if ('P' <= S.charAt(i) && S.charAt(i) <= 'S')
				result = result + 8;
			else if ('T' <= S.charAt(i) && S.charAt(i) <= 'V')
				result = result + 9;
			else if ('W' <= S.charAt(i) && S.charAt(i) <= 'Z')
				result = result + 10;
		}
		System.out.println(result);
	}

}
