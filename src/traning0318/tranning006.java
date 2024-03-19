package traning0318;

import java.util.Scanner;

public class tranning006 {

	public static void main(String[] args) {

		double sum = 0;
		double div = 0;

		Scanner scn = new Scanner(System.in);
		System.out.print("dnum 배열의 길이를 입력하십시오.");
		int input = scn.nextInt();

		double[] dnum = new double[input];
		System.out.println("초기화하지 않은 dnum[]의 값은 ");
		for (int i = 0; i < dnum.length; i++) {
			System.out.print(dnum[i] + " ");
		}
		System.out.println();
		System.out.println("각 배열에 값을 입력하십시오.(소수)");

		for (int i = 0; i < dnum.length; i++) {
			double in = scn.nextDouble();
			dnum[i] = in;
			System.out.println("dnum[" + i + "] 번째 데이터 입력: " + dnum[i]);
		}

		for (int i = 0; i < dnum.length; i++) {
			sum += dnum[i];
		}
		div = sum / dnum.length;
		System.out.println("배열의 합은: " + sum + "입니다.");
		System.out.println("배열의 평균은: " + div + "입니다.");
	}

}
