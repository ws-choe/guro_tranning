package assignmentKiosk;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainMenu {
	List<Food> koreaMenu = new ArrayList<>();
	List<Food> japanMenu = new ArrayList<>();
	List<Food> thaiMenu = new ArrayList<>();
	List<Food> drinkMenu = new ArrayList<>();

	Order order = new Order(); // Order 클래스 생성
	Scanner scr = new Scanner(System.in);

	public MainMenu() {
		koreaMenu.add(new Food("김밥", "€ 12.0", "김, 현미, 단무지로 구성된 간편식 "));
		koreaMenu.add(new Food("떡볶이", "€ 8.0", "쌀떡, 매콤한 소스로 만들어진 간식 "));
		koreaMenu.add(new Food("순대", "€ 10.0", "가마솥에서 48시간 찐 돼지 내장 고기, 별미"));

		japanMenu.add(new Food("스시", "€ 15.0", "활어회, 현미, 와사비로 구성된 고급 초밥"));
		japanMenu.add(new Food("라멘", "€ 11.0", "닭으로 우러낸 육수와 함께 즐기는 일식 라멘"));
		japanMenu.add(new Food("와규동", "€ 13.0", "중간 정도 익힌 살치살이 살포시 올라간 간장 덮밥"));

		thaiMenu.add(new Food("푸팟퐁커리", "€ 23.0", "게를 커리와 함께 씹어먹는 풍미"));
		thaiMenu.add(new Food("뚬양꿍", "€ 6.0", "태국 수프"));
		thaiMenu.add(new Food("팟타이", "€ 10.0", "매콤한 소스와 함께 즐기는 쌀로 만든 넓적한 면"));

		drinkMenu.add(new Food("맥주", "€ 1.5", "독일 수제 맥주"));
		drinkMenu.add(new Food("소주", "€ 8.0", "한국식 증류주"));
		drinkMenu.add(new Food("사케", "€ 15.0", "일본식 증류주"));
	}

	public void showMainMenu() {
		System.out.println("\"GLOBAL FOOD에 오신걸 환영합니다.\" ");
		System.out.println("아래 메뉴판을 보고 메뉴를 선택해서 입력해 주십시오.");
		System.out.println();
		System.out.println("[ GLOBAL FOOD MENU ]");
		System.out.println("1. koreafood       | 한국 음식");
		System.out.println("2. japanfood       | 일본 음식");
		System.out.println("3. thaifood        | 태국 음식");
		System.out.println("4. drink           | 주류");
		System.out.println();
		System.out.println("[ ORDER MENU ]     ");
		System.out.println("5. Order           | 장바구니 확인 후 주문을 진행합니다.");
		System.out.println("6. Cancel          | 진행중인 주문을 취소합니다.");

		try {
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
				showMainMenu();
				break;
			}

// 숫자가 아닌 문자를 입력시 예외 처리
		} catch (InputMismatchException e) {
			System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
			System.out.println("3초 후 첫 화면으로 돌아갑니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ae) {
				System.out.println(ae);
			}
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");
			scr.next();
			showMainMenu();
		}
	}

// 한식 ----------------------------------------------------------------------
//---------------------------------------------------------------------------
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

		if (chooiseKoreaFood < 4) {
			int koreaFoodInfo = chooiseKoreaFood - 1;

			Food selectedKoreaFood = koreaMenu.get(koreaFoodInfo);
			System.out.println("\n" + "\"" + selectedKoreaFood.getName() + " | " + selectedKoreaFood.getPrice() + " | "
					+ selectedKoreaFood.getDescription() + "\"");
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인  2. 취소");

//예외 처리
			try {
				int check = scr.nextInt();
				scr.nextLine();

				if (check == 1) {
					order.addbasket(selectedKoreaFood);
					System.out.println(selectedKoreaFood.getName() + "가 장바구니에 추가되었습니다.");
					System.out.println();
				} else if (check == 2) {
					System.out.println("장바구니 추가가 취소 되었습니다.");
				} else {
					System.out.println("숫자를 잘못 입력하였습니다.");
				}
				showMainMenu();

			} catch (InputMismatchException e) {
				System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
				System.out.println("3초 후 첫 화면으로 돌아갑니다.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ae) {
					System.out.println(ae);
				}
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		} else {
			System.out.println("숫자를 잘못 입력하였습니다.");
		}
		showMainMenu();
	}

// 일식 ----------------------------------------------------------------------
//---------------------------------------------------------------------------
	public void showjapanMenu() {
		System.out.println();
		System.out.println(" [ korea food menu ]");
		for (int i = 0; i < japanMenu.size(); i++) {
			Food menu = japanMenu.get(i); // get()통해 음식 정보 대입
			System.out.println(
					(i + 1) + ". " + menu.getName() + "  | " + menu.getPrice() + " | " + menu.getDescription());
		}

		System.out.print("상품 선택 : ");
		int chooiseJapanFood = scr.nextInt();
		scr.nextLine();

		if (chooiseJapanFood < 4) {
			int japanFoodInfo = chooiseJapanFood - 1;

			Food selectedJapanFood = japanMenu.get(japanFoodInfo);
			System.out.println("\n" + "\"" + selectedJapanFood.getName() + " | " + selectedJapanFood.getPrice() + " | "
					+ selectedJapanFood.getDescription() + "\"");
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인  2. 취소");

//예외 처리
			try {
				int check = scr.nextInt();
				scr.nextLine();

				if (check == 1) {
					order.addbasket(selectedJapanFood);
					System.out.println(selectedJapanFood.getName() + "가 장바구니에 추가되었습니다.");
					System.out.println();
				} else if (check == 2) {
					System.out.println("장바구니 추가가 취소 되었습니다.");
				} else {
					System.out.println("숫자를 잘못 입력하였습니다.");
				}
				showMainMenu();

			} catch (InputMismatchException e) {
				System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
				System.out.println("3초 후 첫 화면으로 돌아갑니다.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ae) {
					System.out.println(ae);
				}
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		} else {
			System.out.println("숫자를 잘못 입력하였습니다.");
		}
		showMainMenu();
	}

// 동남아식 --------------------------------------------------------------------
//---------------------------------------------------------------------------
	public void showthaiMenu() {
		System.out.println();
		System.out.println(" [ thai food menu ]");
		for (int i = 0; i < thaiMenu.size(); i++) {
			Food menu = thaiMenu.get(i); // get()통해 음식 정보 대입
			System.out.println(
					(i + 1) + ". " + menu.getName() + "  | " + menu.getPrice() + " | " + menu.getDescription());
		}

		System.out.print("상품 선택 : ");
		int chooiseThaiFood = scr.nextInt();
		scr.nextLine();

		if (chooiseThaiFood < 4) {
			int thaiFoodInfo = chooiseThaiFood - 1;

			Food selectedThaiFood = thaiMenu.get(thaiFoodInfo);
			System.out.println("\n" + "\"" + selectedThaiFood.getName() + " | " + selectedThaiFood.getPrice() + " | "
					+ selectedThaiFood.getDescription() + "\"");
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인  2. 취소");

//예외 처리		
			try {
				int check = scr.nextInt();
				scr.nextLine();

				if (check == 1) {
					order.addbasket(selectedThaiFood);
					System.out.println(selectedThaiFood.getName() + "가(이) 장바구니에 추가되었습니다.");
					System.out.println();
				} else if (check == 2) {
					System.out.println("장바구니 추가가 취소 되었습니다.");
				} else {
					System.out.println("숫자를 잘못 입력하였습니다.");
				}
				showMainMenu();

			} catch (InputMismatchException e) {
				System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
				System.out.println("3초 후 첫 화면으로 돌아갑니다.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ae) {
					System.out.println(ae);
				}
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		} else {
			System.out.println("숫자를 잘못 입력하였습니다.");
		}
		showMainMenu();
	}

// 주류 --------------------------------------------------------------------
//---------------------------------------------------------------------------
	public void showdrinkMenu() {
		System.out.println();
		System.out.println(" [ drink menu ]");
		for (int i = 0; i < drinkMenu.size(); i++) {
			Food menu = drinkMenu.get(i); // get()통해 음식 정보 대입
			System.out.println(
					(i + 1) + ". " + menu.getName() + "  | " + menu.getPrice() + " | " + menu.getDescription());
		}

		System.out.print("상품 선택 : ");
		int chooiseDrinkFood = scr.nextInt();
		scr.nextLine();

		if (chooiseDrinkFood < 4) {
			int drinkFoodInfo = chooiseDrinkFood - 1;

			Food selectedDrinkFood = drinkMenu.get(drinkFoodInfo);
			System.out.println("\n" + "\"" + selectedDrinkFood.getName() + " | " + selectedDrinkFood.getPrice() + " | "
					+ selectedDrinkFood.getDescription() + "\"");
			System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
			System.out.println("1. 확인  2. 취소");

//예외 처리
			try {
				int check = scr.nextInt();
				scr.nextLine();

				if (check == 1) {
					order.addbasket(selectedDrinkFood);
					System.out.println(selectedDrinkFood.getName() + "가 장바구니에 추가되었습니다.");
					System.out.println();
				} else if (check == 2) {
					System.out.println("장바구니 추가가 취소 되었습니다.");
				} else {
					System.out.println("숫자를 잘못 입력하였습니다.");
				}
				showMainMenu();

			} catch (InputMismatchException e) {
				System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
				System.out.println("3초 후 첫 화면으로 돌아갑니다.");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException ae) {
					System.out.println(ae);
				}
				System.out.println("----------------------------------");
				System.out.println("----------------------------------");
			}
		} else {
			System.out.println("숫자를 잘못 입력하였습니다.");
		}
		showMainMenu();
	}

//---------------------------------------------------------------------------
// 주문 확인 화면 표시 -----------------------------------------------------------
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
		System.out.println("€ " + order.totalPrice());

		System.out.println("\n1. 주문  2. 메뉴판");

//예외 처리		
		try {
			int checkNumber = scr.nextInt();
			scr.nextLine();

			if (checkNumber == 1) {
				OrderComplete();

			} else if (checkNumber == 2) {
				System.out.println("메뉴판으로 돌아갑니다.");
			}
			showMainMenu();

		} catch (InputMismatchException e) {
			System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
			System.out.println("3초 후 첫 화면으로 돌아갑니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ae) {
				System.out.println(ae);
			}
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");

			showMainMenu();
		}

	}

// 주문 완료 표시
	public void OrderComplete() {
		int orderNumber = order.getOrderNumber();
		System.out.println("주문이 완료되었습니다!");
		System.out.println();
		System.out.println("대기 번호는 [ " + orderNumber + " ] 번 입니다.");
		System.out.println("(3초 후 메뉴판으로 돌아갑니다.)");
		System.out.println();

		order.Clearbasket();
		order.setOrderNumber(orderNumber + 1);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		showMainMenu();
	}

// 주문 취소 표시
	public void OrderCancel() {
		System.out.println();
		System.out.println("진행하던 주문을 취소하시겠습니까?");
		System.out.println("1. 확인 2. 취소");

//예외 처리
		try {
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

		} catch (InputMismatchException e) {
			System.out.println("문자 입력은 불가합니다. 숫자만 입력해 주세요.");
			System.out.println("3초 후 첫 화면으로 돌아갑니다.");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ae) {
				System.out.println(ae);
			}
			System.out.println("----------------------------------");
			System.out.println("----------------------------------");

			showMainMenu();
		}
	}

}// 클래스 종료

//재입력