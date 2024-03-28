package assignmentKiosk;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Food> basket;
	private int orderNumber;

	public Order() {
		basket = new ArrayList<>();
		orderNumber = 1;
	}

	public List<Food> getbasket() {
		return basket;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public void addbasket(Food menu) {
		basket.add(menu);
	}

	public void Clearbasket() {
		basket.clear();
	}

	public double totalPrice() {
		double total = 0.0;
		for (Food menu : basket) { // basket 객체가 소진될 때까지 menu 변수에 할당.
			total += Double.parseDouble(menu.getPrice().substring(2));
		}
		return total;
	} // double.parseDouble(); : 문자열을 실수로 반환. substring은 앞에 문자열 2개 제거.

}// 클래스 종료
