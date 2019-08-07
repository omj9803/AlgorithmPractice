package BrutePose;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
//		int sn[] = new int[num];
//		int count = 1;
//		int rept = count;
		
		for(int i = 0;i<num;i++) {
			if(selfNumber(i)==num) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");

//		while (true) {
//			rept = selfNumber(rept);
//			if (selfNumber(rept) == num) {
//				System.out.println(rept);
//				return;
//			}
//			if (rept > num) {
//				rept = count++;
//			}
//		}

	}

	static int selfNumber(int n) {
		int result = n;
		while (true) {
			result = result + n % 10;
			n = n / 10;
			if (n == 0)
				break;
		}
		return result;
	}
}
