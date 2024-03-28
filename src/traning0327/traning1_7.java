package traning0327;

import java.util.Scanner;

public class traning1_7 {

	public static void main(String[] args) {

//입력한 숫자만큼 +*+*를 출력		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 개를 표시할까요?");
//		int cnn = 0;
//		do {
//			cnn = sc.nextInt();
//		} while (cnn != cnn);
//		for (int i = 0; i < cnn; i++) {
//			if (i % 2 > 0) {
//				System.out.print("*");
//			} else
//				System.out.print("+");
//		}
//	}
//}
//양의 정숫값 n을 읽어서 1부터 n까지 곱하는 프로그램
		int num = 0;
		int cnn = 1;
		Scanner scr = new Scanner(System.in);
		System.out.print("양의 정숫값: ");
		num = scr.nextInt();
		for (int i = 1; i <= num; i++) {
			cnn = cnn * i;
		}
		System.out.println(cnn);

	}
}