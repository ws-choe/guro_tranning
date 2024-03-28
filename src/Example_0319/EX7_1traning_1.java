package Example_0319;

class plusMinus {
	int x, y;

	int plus() {
		return x + y;
	}

}

class multiDiv {
	plusMinus c = new plusMinus();
	int x, y;

	int multi() {
		return x * y;
	}

}

public class EX7_1traning_1 {
	public static void main(String args[]) {
		multiDiv a = new multiDiv();
		a.c.x = 10;
		a.c.y = 25;
		System.out.print(a.c.plus()); // 포함관계일 경우 a.c.변수 사용해야 함.
	}
}
