package Math1;

import java.util.Scanner;

public class MinimumBenefit {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long fixCost = scan.nextInt();
		long changeCost = scan.nextInt();
		long num = scan.nextInt();
		long result;

		if (num - changeCost > 0)
			result = fixCost / (num - changeCost) + 1;

		else
			result = -1;

		System.out.println(result);
	}
}