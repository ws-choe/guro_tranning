package traning0319;

class Tv {
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class smartTv extends Tv {
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}

public class EX7_1 {

	public static void main(String[] args) {
		smartTv stv = new smartTv(); //Tv 클래스를 상속받은 smartTv로, Tv 속성, 기능 물론 smartTv 속성, 기능까지 다 있음.
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");

		Tv lgTv = new Tv(); //Tv 클래스부터 생성된 인스턴스는 전원, 채널 업다운 밖에 없음.
		lgTv.channel = 5;
		lgTv.channelDown();
		System.out.println(lgTv.channel);
		
	}

}
