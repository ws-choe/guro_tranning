package traning0319;

class par {
	int x = 86;
	int y = 93;
}

class child extends par {
	int x = 73;

	void method() {
		System.out.println("super.x: " + super.x);
		System.out.println("this.x: " + this.x);
		System.out.println("x: " + x);
		System.out.println("super.y: " + super.y);
		System.out.println("this.y: " + this.y);
		System.out.println("y: " + y);
	}
}

class EX7_3 {
	public static void main(String args[]) {
		child c = new child();
		c.method();
	}
}