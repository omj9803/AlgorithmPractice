// ������ �Ǵ��ϴ� ���α׷��� ¥����
package Condition;

import java.util.Scanner;

public class YunNyun {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();

		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else if (year % 4 == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
