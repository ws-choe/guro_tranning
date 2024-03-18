package traning0229;

import java.util.Scanner;

public class chap003 {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		System.out.println("두 개의 정숫값을 입력하십시오.");
		int a = scr.nextInt();
		int b = scr.nextInt();
		System.out.println("정수 A: " + a);
		System.out.println("정수 B: " + b);

		if (a < b) {
			for (int i = a; i <= b; i++) {
				System.out.print(" " + i);
			}

		} else if (a > b) {
			for (int i = b; i <= a; i++)
				System.out.print(" " + i);

		}
	}
}