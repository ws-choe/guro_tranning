package traning_round1;

import java.util.Scanner;

public class traning_010 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.print("1부터 n까지의 합을 구합니다.");
		System.out.println();
		System.out.print("n의 값: ");

		int num = scr.nextInt();
		int n = 0;

		for (int i = 1; i <= num; i++) {
			n = n + i;
			if (i < num) {
				System.out.print(i + "+");
			} else {
				System.out.print(i + "=");
			}
		}
		System.out.print(n);
	}
}
