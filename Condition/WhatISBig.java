// 입력한 두 수 중 어느 숫자가 더 큰지 부등호 혹은 등호를 출력하라
package Condition;

import java.util.Scanner;

public class WhatISBig {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();

		if (a > b)
			System.out.println(">");
		else if (a < b)
			System.out.println("<");
		else
			System.out.println("==");
	}

}
