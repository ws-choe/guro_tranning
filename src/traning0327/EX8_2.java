package traning0327;

import java.util.zip.DataFormatException;

public class EX8_2 {

	public static void main(String[] args) {
		System.out.println(1 + " + 무조건적 실행");
		int boo[] = { 5, 3, 10, 11 };

		try {
			int x = 1.5;
			System.out.println();
			System.out.println(boo[4]);
			System.out.println(0 / 0);
			System.out.println(2);
		} catch (ArithmeticException ae) {
			System.out.println(3);
		} catch (ArrayIndexOutOfBoundsException ac) {
			System.out.println("배열 예외 처리");
		} catch (DataFormatException ax) {
			System.out.println("데이터 타입 오류");
		}

		System.out.println(4);
	}
}
