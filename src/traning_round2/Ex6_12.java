package traning_round2;

public class Ex6_12 {

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.color = "white";
		c1.gear = "auto";
		c1.door = 4;
		System.out.println(c1.color + " " + c1.gear + " " + c1.door);

		Car c2 = new Car("Orange", "Manual", 4);
		System.out.println(c2.color + " " + c2.gear + " " + c2.door);
	}

}

class Car {
	String color;
	String gear;
	int door;

	Car() {
	}

	Car(String c, String g, int d) {
		color = c;
		gear = g;
		door = d;

	}
}