package traning_round1;

import java.util.Scanner;

public class traning_004 {

	public static void main(String[] args) {

//		System.out.println("카운트다운 합니다.");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("양의 정숫값: ");
//		int Num = sc.nextInt();
//
//		for (int i = Num; 0 <= i; --i)
//			System.out.println(i);

		System.out.println("카운트다운 합니다.");

		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정숫값: ");
		int Num = sc.nextInt();

		while (Num != 0) {
			Num--;
			System.out.println(Num);
		}
	}
}
