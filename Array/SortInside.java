package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortInside {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String num = scan.nextLine();
		char[] arrnum = new char[num.length()];

		for (int i = 0; i < num.length(); i++) {
			arrnum[i] = num.charAt(i);
		}
		Arrays.sort(arrnum);

		for (int i = arrnum.length - 1; i >= 0; i--)
			System.out.print(arrnum[i]);
	}

}
