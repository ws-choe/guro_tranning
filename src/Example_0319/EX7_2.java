package Example_0319;

public class EX7_2 {

	static class PM {
		int add, sub;

		public String plus(int x, int y) {
			add = x + y;
			return "두 수의 합은 " + add;
		}

		public String minus(int x, int y) {
			sub = x - y;
			return "두 수의 차는 " + sub;
		}
	}

	static class MD extends PM {
		int gop;
		double nanum;

		public String multi(int x, int y) {
			gop = x * y;
			return "두 수의 곱은 " + gop;
		}

		public String div(int x, int y) {
			nanum = (double) x / y;
			return "두 수의 나눈 값은 " + nanum;
		}
	}

	public static void main(String[] args) {
		MD ob1 = new MD();
		String ssum, sminus, smulti, sdiv;
		ssum = ob1.plus(50, 30);
		sminus = ob1.minus(50, 30);
		smulti = ob1.multi(50, 30);
		sdiv = ob1.div(50, 30);
		System.out.println(ssum);
		System.out.println(sminus);
		System.out.println(smulti);
		System.out.println(sdiv);
	}

}
