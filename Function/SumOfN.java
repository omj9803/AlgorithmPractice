// �־��� N���� ���� ���ؼ� ��ȯ�ϴ� �Լ�
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
