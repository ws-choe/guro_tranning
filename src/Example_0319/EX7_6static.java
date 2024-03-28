package Example_0319;

public class EX7_6static {

	public static void main(String[] args) {
		System.out.println(StaticTest.max(10, 20));
	}

}

class StaticTest {
	static int width = 200;
	static int height = 120;

	static {
	}

	static int max(int a, int b) {
		return a > b ? a : b;
	}

}