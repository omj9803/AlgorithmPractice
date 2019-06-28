// 1546.주어진 점수들의 최대값으로 새로운 평균 구하기
package Array_1Dimension;

import java.util.Scanner;

public class newAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num = scan.nextInt();
		double score[] = new double[(int) num];
		double max = 0, sum = 0;

		for (int i = 0; i < num; i++) {
			score[i] = scan.nextInt();
			if (score[i] > max)
				max = score[i];
		}
		for (int i = 0; i < num; i++) {
			score[i] = score[i] / max * 100;
			sum = score[i] + sum;
		}
		System.out.printf("%.2f", sum / num);
	}

}
