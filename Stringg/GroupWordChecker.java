// 1316. 
package Stringg;

import java.util.Scanner;

public class GroupWordChecker {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = num;

		for (int i = 0; i < num; i++) {
			String word = scan.next();
			boolean wordCheck[] = new boolean[26];

			for (int j = 1; j < word.length(); j++) {
				if (word.charAt(j - 1) != word.charAt(j)) {
					if (wordCheck[word.charAt(j) - 97] == true) {
						count--;
						break;
					}
					wordCheck[word.charAt(j - 1) - 97] = true;
				}
			}
		}
		System.out.println(count);

	}

}
