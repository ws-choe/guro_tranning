package Example_0327;

public class EX1 {

	public static void main(String[] args) {

		try {
			int a = 0;
			int b = 5 / a;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("exception");
		}

	}

}
