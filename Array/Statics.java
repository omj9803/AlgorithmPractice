package Array;

import java.util.HashMap;
import java.util.Scanner;

public class Statics {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int num = scan.nextInt();
		int number[] = new int[num];
		for (int i = 0; i < num; i++) {
			number[i] = scan.nextInt();
		}
		for (int j = 0; j < num; j++) {
			for (int i = 0; i < num - 1; i++) {
				if (number[i] > number[i + 1]) {
					int temp;
					temp = number[i];
					number[i] = number[i + 1];
					number[i + 1] = temp;
				}
			}
		}
		int max = 0, mid = 0, count = 0;
		
//		int cntPos[] = new int[number[num - 1] + 1];
//		int cntNeg[] = new int[number[num - 1] + 1];
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] >= 0) {
//				cntPos[number[i]]++;
//			} else
//				cntNeg[-number[i]]++;
//			max = max + number[i];
//			if (i == num / 2)
//				mid = number[i];
//		}
		System.out.println(max / num);
		System.out.println(mid);
//		for (int i = 0; i < cntPos.length; i++) {
//			if (max > cntPos[i])
//				count = i;
//		}
//		for (int i = 0; i < cntNeg.length; i++) {
//			if (max > cntNeg[i])
//				count = i;
//		}
		System.out.println(count);
		System.out.println(number[num - 1] - number[0]);
	}
}
