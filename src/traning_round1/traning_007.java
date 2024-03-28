package traning_round1;

import java.util.Scanner;

public class traning_007 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int num = 0;
		int cnt = 0;
		System.out.print("양의 정숫값의 자릿수를 표시합니다.");
		System.out.println();
		System.out.print("양의 정숫값: ");
		num = scr.nextInt();

		while (num > 0) {
			num /= 10;
			cnt++;
		}

		System.out.printf("입력한 숫자는 %d자리입니다.", cnt);

	}

}

//(int)(Math.log10(변수) + 1);로 활용 가능.