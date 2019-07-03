// 4673 selfNumber
package Function;

public class SelfNumber {

	public static void main(String[] args) {
		int num = 10000;
		int sn[] = new int[num];
		for (int i = 1; i <= num; i++) {
			if (selfNumber(i) <= num) {
				sn[selfNumber(i) - 1] = 1;
			}
		}
		for (int i = 0; i < num; i++) {
			if (sn[i] == 0)
				System.out.println(i+1);
		}
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
