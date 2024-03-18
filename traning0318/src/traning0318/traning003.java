package traning0318;

public class traning003 {

	public static void main(String[] args) {

		int score[][];
		score = new int[2][2];
		score[0][0] = 90;
		score[0][1] = 80;
		score[1][0] = 70;
		score[1][1] = 80;

		int sum1;
		int sum2;
		sum1 = score[0][0] + score[0][1];
		sum2 = score[1][0] + score[1][1];

		System.out.println("학생번호1");
		System.out.println("국어점수: " + score[0][0]);
		System.out.println("수학점수: " + score[0][1]);
		System.out.println("학생번호2");
		System.out.println("국어점수: " + score[1][0]);
		System.out.println("수학점수: " + score[1][1]);
		System.out.println("학생번호1");
		System.out.printf("국어: %d, 수학: %d, 평균: %.1f\n", score[0][0], score[0][1],
				(double) (score[0][0] + score[0][1]) / score.length);
		System.out.println("학생번호2");
		System.out.printf("국어: %d, 수학: %d, 평균: %.1f\n", score[1][0], score[1][1],
				(double) (score[1][0] + score[1][1]) / score.length);

		System.out.println("추가 학생 번호가 없는지");
		//주석 확인
	}

}
