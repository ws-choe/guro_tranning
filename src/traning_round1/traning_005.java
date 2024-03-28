package traning_round1;

import java.util.Scanner;

public class traning_005 {

	public static void main(String[] args) {

//		System.out.print("몇 개의 *를 표시할까요?: ");
//		Scanner src = new Scanner(System.in);
//		int num = 0;
//		int cnt = 0;
//		num = src.nextInt();
//
//		while (cnt < num) {
//			cnt++;
//			System.out.print("*");
//		}

		System.out.print("몇 개의 *를 표시할까요?: ");
		Scanner src = new Scanner(System.in);
		int num = 0;
		num = src.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print("*");
		}

	}
}
