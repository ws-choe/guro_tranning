package assignmentKiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Assignment.Order;

public class MainMenu {
	List<Food> koreaMenu = new ArrayList<>();
	List<Food> japanMenu = new ArrayList<>();
	List<Food> thaiMenu = new ArrayList<>();
	List<Food> drinkMenu = new ArrayList<>();

	Order order = new Order(); // Order 클래스 생성

	Scanner scr = new Scanner(System.in);

	public MainMenu() {
		koreaMenu.add(new Food("kimbob", "Euro 12.0", "김, 현미, 단무지로 구성된 간편식 "));
		koreaMenu.add(new Food("kimbob", "Euro 12.0", "김, 현미, 단무지로 구성된 간편식 "));
		koreaMenu.add(new Food("kimbob", "Euro 12.0", "김, 현미, 단무지로 구성된 간편식 "));

		japanMenu.add(new Food("sushi", "Euro 15.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		japanMenu.add(new Food("sushi", "Euro 15.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		japanMenu.add(new Food("sushi", "Euro 15.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));

		thaiMenu.add(new Food("puphatphongcurry", "Euro 23.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		thaiMenu.add(new Food("puphatphongcurry", "Euro 23.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		thaiMenu.add(new Food("puphatphongcurry", "Euro 23.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));

		drinkMenu.add(new Food("beer", "Euro 1.3", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		drinkMenu.add(new Food("beer", "Euro 1.3", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		drinkMenu.add(new Food("beer", "Euro 1.3", "활어회, 현미, 와사비로 구성된 고급 초밥"));
	}

	public void showMainMenu() {
		System.out.println("\"GLOBAL FOOD에 오신걸 환영합니다.\" ");
		System.out.println("아래 메뉴판을 보고 메뉴를 선택해서 입력해 주십시오.");
		System.out.println();
		System.out.println("[ GLOBAL FOOD MENU ]");
		System.out.println("1. koreafood        | 한국 음식");
		// 차후 입력

		System.out.print("메뉴 선택 : ");
		int choice = scr.nextInt();
		scr.nextLine();

		switch (choice)

		{
		case 1:
			showkoreaMenu();
			break;
		case 2:
			showjapanMenu();
			break;
		case 3:
			showthaiMenu();
			break;
		case 4:
			showdrinkMenu();
			break;
		case 5:
			showOrderMenu();
			break;
		case 6:
			OrderCancel();
			break;
		default:
			System.out.println("1~6번까지 숫자만 입력 가능합니다.");
			break;

		}
	}

	// 한식
	public void showkoreaMenu() {
		System.out.println();
		System.out.println(" [ korea food menu ]");
		for (int i = 0; i < koreaMenu.size(); i++) {
			Food menu = koreaMenu.get(i); // get()통해 음식 정보 대입
			System.out.println(
					(i + 1) + ". " + menu.getName() + "  | " + menu.getPrice() + " | " + menu.getDescription());
		}

		System.out.print("상품 선택 : ");
		int chooiseKoreaFood = scr.nextInt();
		scr.nextLine();

		int koreaFoodInfo = chooiseKoreaFood - 1;

		Food selectedKoreaFood = koreaMenu.get(koreaFoodInfo);
		System.out.println("\n" + "\"" + selectedKoreaFood.getName() + " | " + selectedKoreaFood.getPrice() + " | "
				+ selectedKoreaFood.getDescription() + "\"");
		System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
		System.out.println("1. 확인  2. 취소");

		int check = scr.nextInt();
		scr.nextLine();

		if (check == 1) {
			order.addbasket(selectedKoreaFood);
			System.out.println(selectedKoreaFood.getName() + "가 장바구니에 추가되었습니다.");
			System.out.println();
		} else if (check == 2) {
			System.out.println("장바구니 추가가 취소 되었습니다.");
		} else
			System.out.println("숫자를 잘못 입력하였습니다.");

		showMainMenu();
	}

	// 일식
	public void showjapanMenu() {
		System.out.println();
		System.out.println(" [ korea food menu ]");
		for(int i = 0; i < japanMenu.size(); i++) {
			Food menu = japanMenu.get(i); //get()통해 음식 정보 대입
			System.out.println((i+1) + ". " + menu.getName() + "  | " + menu.getPrice() + " | " + menu.getDescription());
		}
		
		System.out.print("상품 선택 : ");
		int chooiseJapanFood = scr.nextInt();
		scr.nextLine();
		
		int japanFoodInfo = chooiseJapanFood - 1;
		
		Food selectedJapanFood = japanMenu.get(japanFoodInfo);
		System.out.println("\n" + "\"" + selectedJapanFood.getName() + " | " + selectedJapanFood.getPrice() + " | " + selectedJapanFood.getDescription() + "\"");
		System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
		System.out.println("1. 확인  2. 취소");
		
		int check = scr.nextInt();
		scr.nextLine();
		
		if(check == 1) {
			order.addbasket(selectedJapanFood);
			System.out.println(selectedJapanFood.getName() + "가 장바구니에 추가되었습니다.");
			System.out.println();
		} else if (check == 2) {
			System.out.println("장바구니 추가가 취소 되었습니다.");
		} else 
			System.out.println("숫자를 잘못 입력하였습니다.");
		
		showMainMenu();
	}

	public void showOrderMenu() {
		System.out.println("아래와 같이 주문하시겠습니까?");
		System.out.println();
		System.out.println("[ Order ]");

		List<Food> basket = order.getbasket();

		for (int i = 0; i < basket.size(); i++) {
			Food menu = basket.get(i);
			System.out.println(menu.getName() + " | " + menu.getPrice() + " | " + menu.getDescription());
		}
		System.out.println();
		System.out.println("[ Total ]");
		System.out.println("Euro " + order.totalPrice());

		System.out.println("\n1. 주문  2. 메뉴판");
		int checkNumber = scr.nextInt();
		scr.nextLine();

		if (checkNumber == 1) {
			OrderComplete();

		} else if (checkNumber == 2) {
			System.out.println("메뉴판으로 돌아갑니다.");
			showMainMenu();
		}

	}

	public void OrderComplete() {
		int orderNumber = order.getOrderNumner();
		System.out.println("주문이 완료되었습니다!");
		System.out.println();
		System.out.println("대기 번호는 [ " + orderNumber + " ] 번 입니다.");
		System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
		System.out.println();

		order.Clearbasket();
		order.setOrderNumber(orderNumber + 1);

		try {
			Thread.sleep(m3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		showMainMenu();
	}

	public void OrderCancel() {
		System.out.println();
		System.out.println("진행하던 주문을 취소하시겠습니까?");
		System.out.println("1. 확인 2. 취소");

		int cancelNum = scr.nextInt();
		scr.nextLine();

		if (cancelNum == 1) {
			order.Clearbasket();
			System.out.println("진행하던 주문이 취소되었습니다.");
			System.out.println();
		} else if (cancelNum == 2) {
			System.out.println("주문을 유지하고 메뉴판으로 돌아갑니다.");
		}
		showMainMenu();
	}

}

}
// 클래스 괄호
