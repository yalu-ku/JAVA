interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobliePhoneInterface extends PhoneInterface{ //인터페이스 상속
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ //인터페이스 선언
	public void play();
	public void stop();
}

class PDA { //클래스 작성
	public int calculate(int x, int y) {
		return x + y;
	}
}

//class SamsungPhone implements PhoneInterface{ //인터페이스 구현 implement
//	@Override
//	public void sendCall() {
//		System.out.println("띠리리리링");
//	}
//	@Override
//	public void receiveCall() {
//		System.out.println("전화가 왔습니다.");
//	}
//	
//	// 메소드 추가 작성
//	public void flash() {System.out.println("전화기에 불이 켜졌습니다.");}
//}

class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{
	// MobliePhoneInterface의 추상 메소드 구현
	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화 왔어요");
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다");
	}
	@Override
	public void receiveSMS() {
		System.out.println("문자왔어요");
	}
	@Override
	public void play() {
		System.out.println("음악 연주합니다.");
	}
	@Override
	public void stop() {
		System.out.println("음악 중단합니다.");
	}
	
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("일정 관리합니다.");
	}
} 

public class InterfaceEx {
	public static void main(String[] args) {
//		// class SamsungPhone implements PhoneInterface
//		SamsungPhone phone = new SamsungPhone();
//		phone.printLogo();
//		phone.sendCall();
//		phone.receiveCall();
//		phone.flash();
		
		SmartPhone phone = new SmartPhone();
		phone.printLogo();
		phone.sendCall();
		phone.play();
		System.out.println("3과 5를 더하면" + phone.calculate(3, 5));
		phone.schedule();
	}
}
