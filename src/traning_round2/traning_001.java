package traning_round2;

import java.util.Scanner;

public class traning_001 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			int sign = scan.nextInt();
			System.out.println("정수 sign: " + sign);
			System.out.println("sing0f(sign)는 " + sing0f(sign) + "입니다");
		}
	}

	public static int sing0f(int x) {
		if (x < 0) {
			return -1;
		} else if (x > 0) {
			return 1;
		} else if (x == 0) {
			return 0;
		} else {
			return 0;
		}
	}
}