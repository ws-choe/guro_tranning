package traning0229;

import java.util.Random;
import java.util.Scanner;

public class chap002 {

	public static void main(String[] args) {

		Scanner src = new Scanner(System.in);
		Random rr = new Random();
		int num = 0;
		int ran = rr.nextInt(90) + 10;
		int cnt = 0;

		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("10부터 99사이의 숫자를 맞추세요.");

		do {
			cnt++;
			System.out.print("어떤 숫자일까? ");
			num = src.nextInt();

			if (num < ran) {
				System.out.println("더 큰 숫자입니다.");
			} else if (num > ran) {
				System.out.println("더 작은 숫자입니다.");
			}
		} while (num != ran && cnt < 5);
		System.out.println("정답입니다.");
		System.out.println("정답은 " + ran);
	}
}
