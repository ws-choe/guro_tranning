package traning0318;

public class traning004 {

	public static void main(String[] args) {

		int[][] point1 = { { 2, 3, 4 }, { 3, 2, 1 } };
		int[][] point2 = { { 1, 2, 3 }, { -4, -2, 1 } };
		System.out.println("두 행렬의 합: ");
		for (int i = 0; i < point1.length; i++) {
			for (int j = 0; j < point1[i].length; j++) {
				int sum = point1[i][j] + point2[i][j];
				System.out.print(sum + " ");
				if (j == 2) {
					System.out.println();
					// ok
				}

			}

		}

	}
}
