package traning0307;

public class traning_004 {

	public static void main(String[] args) {

		int n = 5;

		System.out.println("1부터 " + n + "까지의 합을 구하자");
		System.out.println("x의 값은 " + n);
		System.out.println("1부터 5까지의 합은 " + sumUp(n) + "입니다.");

	}

	public static int sumUp(int num) {
		int a = 0;
		for (int i = 1; i <= num; i++) {
			a = a + i;
		}
		return a;
	}

}
