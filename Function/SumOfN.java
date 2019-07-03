// 주어진 N개의 합을 구해서 반환하는 함수
package Function;

import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
	}

	long sum(int[] a) {
		long sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = a[i] + sum;
		}
		return sum;
	}

}
