package traning0319;

public class EX7_3plus {

	public static void main(String[] args) {
		SON c = new SON();
		c.method();
		c.MM();
	}

}

class PP {
	int x = 85;
	int y = 105;
}

class SON extends PP {
	int x = 79;
	int y = 86;

	void method() {
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}

	void MM() {
		System.out.println(this.y);
		System.out.println(super.y);
	}
}
