package traning_round1;

import java.util.Scanner;

public class traning_011 {

	public static void main(String[] args) {
		// 신장별 표준 체중 대응표

		Scanner scr = new Scanner(System.in);

		System.out.print("최소 cm: ");
		int heightMin = scr.nextInt();

		System.out.print("최대 cm: ");
		int heightMax = scr.nextInt();

		System.out.print("단위 cm: ");
		int unit = scr.nextInt();

		double weight = 0;

		while (heightMin <= heightMax) {
			weight = (heightMin - 100) * 0.9;
			System.out.printf("%d, %.1f\n", heightMin, weight);
			heightMin += unit;
		}
	}
}
