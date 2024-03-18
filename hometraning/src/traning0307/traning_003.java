package traning0307;

public class traning_003 {

	public static void main(String[] args) {

		int a = 49, b = 33, c = 74;
		System.out.println("정수 a: " + a);
		System.out.println("정수 b: " + b);
		System.out.println("정수 c: " + c);
		System.out.println("중간 값은: " + min(a, b, c));

	}

	public static int min(int x1, int x2, int x3) {
		if ((x2 < x1 && x1 < x3 || x3 < x1 && x1 < x2)) {
			return x1;
		} else if ((x1 < x2 && x2 < x3 || x3 < x2 && x2 < x1)) {
			return x2;
		} else {
			return x3;
		}
	}
}
