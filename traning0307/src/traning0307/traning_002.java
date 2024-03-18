package traning0307;

public class traning_002 {

	public static void main(String[] args) {

		int a = 86, b = 23, c = 56;
		System.out.println("정수 a: " + a);
		System.out.println("정수 a: " + b);
		System.out.println("정수 a: " + c);
		System.out.println("최솟값은 " + min(a, b, c));
		System.out.println("최대값은 " + max(a, b, c));
	}

	public static int min(int a1, int a2, int a3) {
		if (a1 <= a2 && a1 <= a3) {
			return a1;
		} else if (a2 <= a1 && a2 <= a3) {
			return a2;
		} else if (a3 <= a1 && a3 <= a2) {
			return a3;
		} else {
			return 1;
		}
	}

	public static int max(int a1, int a2, int a3) {
		if (a1 >= a2 && a1 >= a3) {
			return a1;
		} else if (a2 >= a1 && a2 >= a3) {
			return a2;
		} else if (a3 >= a1 && a3 >= a1) {
			return a3;
		} else {
			return 0;
		}

	}
}
