package CalculationAndIO;
import java.util.Scanner;

public class four_cal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.printf("%d%n", a+b);
		System.out.printf("%d%n", a-b);
		System.out.printf("%d%n", a*b);
		System.out.printf("%d%n", a/b);
		System.out.printf("%d%n", a%b);

	}

}
