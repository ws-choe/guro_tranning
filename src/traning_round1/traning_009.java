package traning_round1;

import java.util.Scanner;

public class traning_009 {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		System.out.println("카운트업 합니다.");
		System.out.print("양의 정숫값: ");
		int num = scr.nextInt();
		int cnn = 0;

		for (int i = 0; i <= num; i++) {
			System.out.println(cnn);
			cnn++;
		}
	}
}
