package Iteration_while;

import java.util.Scanner;

public class addCycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int finalNum = N;
		int count = 0;

		while (true) {
			int add = N / 10 + N % 10;
			int newN = ((N % 10) * 10) + (add % 10);
			count++;
			if (newN == finalNum)
				break;
			N = newN;
		}
		System.out.println(count);

	}

}
