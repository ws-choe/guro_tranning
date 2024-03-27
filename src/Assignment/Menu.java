package Assignment;

public class Menu {
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}

	// *** 확인
	public void Show() {
		System.out.printf("%-15s | %s\n", name, description); // 총 15자리 오른쪽 정렬, 문자열
	}

	// ***getter 이해 필요
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

}
