package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class kiosk {
	static class CoffeeOrder {
		String name;
		int price;
		int quantity;

		public CoffeeOrder(String name, int price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}

		public int getTotalPrice() {
			return price * quantity;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<CoffeeOrder> orders = new ArrayList<>();

		String[] menu = { "아메리카노", "라떼", "카푸치노" };
		int[] prices = { 1500, 2500, 3000 };

		while (true) {
			System.out.println("메뉴를 선택해주세요. (주문을 마치려면 0을 입력하세요)");
			for (int i = 0; i < menu.length; i++) {
				System.out.printf("%d. %s (%d원)\n", i + 1, menu[i], prices[i]);
			}

			int choice = scanner.nextInt();

			if (choice == 0) {
				break;
			}

			System.out.println("수량을 입력해주세요.");
			int quantity = scanner.nextInt();

			String selectedMenu = menu[choice - 1];
			int price = prices[choice - 1];

			orders.add(new CoffeeOrder(selectedMenu, price, quantity));

			System.out.println("추가 주문을 하시겠습니까? (예: 1, 아니오: 0)");
			int continueOrder = scanner.nextInt();
			if (continueOrder == 0) {
				break;
			}
		}

		int total = 0;
		System.out.println("주문 내역:");
		for (CoffeeOrder order : orders) {
			System.out.printf("%s %d잔 - %d원\n", order.name, order.quantity, order.getTotalPrice());
			total += order.getTotalPrice();
		}

		System.out.printf("총 금액: %d원\n", total);
	}
}