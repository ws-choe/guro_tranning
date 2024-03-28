package traning_round1;

import java.util.Scanner;

public class traning_008 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.print("양의 정숫값: ");
		int num = scr.nextInt();
		int cnn = 1;

		for (int i = 1; i <= num; i++) {
			cnn *= i;
		}
		System.out.print(cnn);
	}

}
