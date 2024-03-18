package vendingmachine;

import java.util.Scanner;

public class vendingmachine {

	public static void main(String[] args) {

		final String[] beverageNames = { "콜라", "사이다", "밀키스" };
		final int[] beverageCost = { 1200, 1400, 900 };
		final int[] beverageStock = { 4, 3, 2 }; // final로 해서 값을 불변으로 지정.
		int money = 0;
		int selectedbeverage = -1;
		int isExit = 0;

		do {
			for (int index = 0; index < 3; index++) {
				System.out.printf("%d.%s (%s원)\n", index, beverageNames[index], beverageCost[index]);
			}
			do {
				Scanner scan = new Scanner(System.in);
				System.out.println("동전을 투입해 주세요.(투입 금액을 입력)");
				money = money + scan.nextInt();
				System.out.printf("현재 %d원이 투입됐습니다.\n", money);

				do {
					System.out.println("음료를 선택해 주세요");
					selectedbeverage = scan.nextInt();

					if (beverageStock[selectedbeverage] <= 0) {
						System.out.printf("%s 음료가 존재하지 않습니다. 다른 음료를 선택해 주세요.\n", beverageNames[selectedbeverage]);
					}
				} while (beverageStock[selectedbeverage] <= 0);

				if (beverageCost[selectedbeverage] > money) {
					System.out.println("금액이 모자릅니다.");
				}
			} while (beverageCost[selectedbeverage] > money);

			money = money - beverageCost[selectedbeverage];
			beverageStock[selectedbeverage] = beverageStock[selectedbeverage] - 1;

			System.out.printf("%s 음료수가 나왔습니다.\n", beverageNames[selectedbeverage]);

			if (money <= 0) {
				break;
			} else {
				System.out.printf("잔고은 %d원입니다.", money);
				System.out.println("잔고를 돌려 받으시겠습니까?\n(1 입력시 예, 0 입력시 아니오)");
				Scanner scan = new Scanner(System.in);
				isExit = scan.nextInt();
			}
		} while (isExit == 0);
		if (money <= 0) {
			System.out.print("잔고는 없습니다. 안녕히 가십시오.");
		} else {
			System.out.printf("거스름돈은 %d원입니다. 안녕히 가십시오.", money);
		}
	}
} //pull test 주석 처리
//push 추가 주석 처리
