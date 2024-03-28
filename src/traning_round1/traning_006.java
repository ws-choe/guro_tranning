package traning_round1;

import java.util.Scanner;

public class traning_006 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요? ");
		int Num = 0;
		Num = scr.nextInt();

		for (int i = 0; i < Num; i++) {
			if (i % 2 > 0) {
				System.out.print("*");
			} else {
				System.out.print("+");
			}
		}
		System.out.println();
	}
}
