package CalculationAndIO;

import java.util.Scanner;

public class CalculationProcess {
	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int a = scan1.nextInt();
		int b = scan2.nextInt();
		int cal2 = a * ((b - (b % 10)) % 100);
		int cal3 = a * (b / 100);
		System.out.printf("%d%n", a * (b % 10));
		System.out.printf("%d%n", cal2 / 10);
		System.out.printf("%d%n", cal3);
		System.out.printf("%d%n", a*b);

	}

}
