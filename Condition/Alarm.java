// ����̰� 45������ �˶��� ���⶧, �Է��� �ð����� 45�� �����ð��� ���ΰ�
package Condition;

import java.util.Scanner;

public class Alarm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hour = scan.nextInt();
		int minute = scan.nextInt();

		if (minute - 45 < 0) {
			if (hour - 1 < 0) {
				hour = 23;
			} else
				hour = hour - 1;
			minute = minute + 15;
		} else
			minute = minute - 45;

		System.out.println(hour + " " + minute);

	}

}
