// 1157. �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷�
package Stringg;

import java.util.Scanner;

public class WordStudy {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int alpha[] = new int[26];
		int max = 0, maxIndex = 0;
		char print = '/';

		for (int i = 0; i < word.length(); i++) {
			if (65 <= word.charAt(i) && word.charAt(i) <= 90) {
				alpha[word.charAt(i) - 'A']++;
			} else if (97 <= word.charAt(i) && word.charAt(i) <= 122) {
				alpha[word.charAt(i) - 'a']++;
			}
		}

		for (int j = 0; j < alpha.length; j++) {
			if (max < alpha[j]) {
				max = alpha[j];
				maxIndex = j;
				print = (char) ('A' + maxIndex);
			}
			else if (max == alpha[j]) {
				print = '?';
			}
		}
		System.out.println(print);
	}

}
