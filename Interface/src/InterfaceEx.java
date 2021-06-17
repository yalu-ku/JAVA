interface PhoneInterface {
	final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}
}

interface MobliePhoneInterface extends PhoneInterface{ //�������̽� ���
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface{ //�������̽� ����
	public void play();
	public void stop();
}

class PDA { //Ŭ���� �ۼ�
	public int calculate(int x, int y) {
		return x + y;
	}
}

//class SamsungPhone implements PhoneInterface{ //�������̽� ���� implement
//	@Override
//	public void sendCall() {
//		System.out.println("�츮������");
//	}
//	@Override
//	public void receiveCall() {
//		System.out.println("��ȭ�� �Խ��ϴ�.");
//	}
//	
//	// �޼ҵ� �߰� �ۼ�
//	public void flash() {System.out.println("��ȭ�⿡ ���� �������ϴ�.");}
//}

class SmartPhone extends PDA implements MobliePhoneInterface, MP3Interface{
	// MobliePhoneInterface�� �߻� �޼ҵ� ����
	@Override
	public void sendCall() {
		System.out.println("������������~~");
	}
	@Override
	public void receiveCall() {
		System.out.println("��ȭ �Ծ��");
	}
	@Override
	public void sendSMS() {
		System.out.println("���ڰ��ϴ�");
	}
	@Override
	public void receiveSMS() {
		System.out.println("���ڿԾ��");
	}
	@Override
	public void play() {
		System.out.println("���� �����մϴ�.");
	}
	@Override
	public void stop() {
		System.out.println("���� �ߴ��մϴ�.");
	}
	
	//�߰��� �ۼ��� �޼ҵ�
	public void schedule() {
		System.out.println("���� �����մϴ�.");
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
		System.out.println("3�� 5�� ���ϸ�" + phone.calculate(3, 5));
		phone.schedule();
	}
}
