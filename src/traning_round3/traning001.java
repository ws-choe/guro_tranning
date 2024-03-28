package traning_round3;

public class traning001 {

	public static void main(String[] args) {

		double[] score;
		double sum = 0;
		double average = 0;

		score = new double[] { 90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7 };
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (double) score.length;
		System.out.printf("합계는 %.13f\n", sum);
		System.out.printf("평균은 %.2f", average);

	}
}
