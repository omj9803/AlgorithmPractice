package Stringg;

import java.util.Scanner;

public class AsciiCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String ascii = scan.next();
		int result = ascii.charAt(0);
		
		System.out.println(result);
	}

}
