package traning0318;

public class tranning007 {

	public static void main(String[] args) {
		// 다차원배열

		int[][] arr = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 },
				{ 26, 27, 28, 29, 30 } };
		System.out.println("1번째 2차원 배열");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();

		}
		System.out.println();

		int[][] arr2 = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 },
				{ 26, 27, 28, 29, 30 } };
		System.out.println("2번째 2차원 배열");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();

		}
		System.out.println();

		int[][] arr3 = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 },
				{ 26, 27, 28, 29, 30 } };
		System.out.println("3번째 2차원 배열");
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				System.out.printf("%d ", arr[i][j]);
			}
			System.out.println();

		}
	}

}
