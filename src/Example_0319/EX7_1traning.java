package Example_0319;

class PM {
	int x, y;

	int plus() {
		return x + y;
	}

	int minus() {
		return x - y;
	}
}

class MD extends PM { // PM클래스 상속 받음
	int multi() {
		return x * y;
	}

	double div() {
		return (double) x / y;
	}
}

public class EX7_1traning {

	public static void main(String[] args) {
		MD os = new MD(); // PM클래스 상속 받은 MD인스턴스 생성
		MD ss = new MD();
		PM as = new PM(); // PM클래스
		os.x = 10;
		os.y = 15;
		ss.x = 36;
		ss.y = 53;
		as.x = 10;
		as.y = 25;
		System.out.println(os.plus() + "," + ss.plus());
		System.out.println(os.minus() + "," + ss.minus());
		System.out.println(os.multi() + "," + ss.multi());
		System.out.println(os.div() + "," + ss.div());
		
		// System.out.println(as.multi()); //PM클래스 참조 변수

	}

}
