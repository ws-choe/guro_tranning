package traning0229;

import java.util.Scanner;

public class chap001 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int a = 0;

		do {
			System.out.print("세 자리의 정숫값: ");
			a = scr.nextInt();
		} while (a < 100 || a > 999);
		System.out.print("입력한 값은 " + a + "입니다");
	}

}
