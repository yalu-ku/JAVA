class TV {
	private int size;
	public TV(int size) { this.size = size;	}
	protected int getSize() { return size; }
}

class ColorTV extends TV {
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color =color;
	}
	
	protected int getColor() { return color; }
		
	
	public void printProperty() {
		System.out.print(getSize() + "��ġ " + color + "�÷�");
	}
}

class IPTV extends ColorTV {
	private String ip; //�ʵ� ����
	public IPTV(String ip, int size, int color) {
		super(size, color); //�Ű����� �ΰ�¥�� �����ڿ��� ���޹ް� �ʱ�ȭ
		this.ip = ip;//�׷�����, ���� �޸𸮸� �ʱ�ȭ
	}
	//�� �ڵ�
//	protected String getIP() {return ip;}
//	public void printProperty() {
//		System.out.print("���� IPTV�� " + getIP() + "�ּ��� " );
//		print();	
	//������ �ڵ�
	public void printProperty() {
		System.out.print("���� IPTV�� " + ip + "�ּ��� ");
		super.printProperty();
	}
}

public class MyApp {
	public static void main(String[] args) {
//		ColorTV myTV = new ColorTV(32, 1024);
//		myTV.printProperty();
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
	}
}
