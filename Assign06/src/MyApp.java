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
		System.out.print(getSize() + "인치 " + color + "컬러");
	}
}

class IPTV extends ColorTV {
	private String ip; //필드 선언
	public IPTV(String ip, int size, int color) {
		super(size, color); //매개변수 두개짜리 생성자에게 전달받고 초기화
		this.ip = ip;//그러고나서, 본인 메모리를 초기화
	}
	//내 코드
//	protected String getIP() {return ip;}
//	public void printProperty() {
//		System.out.print("나의 IPTV는 " + getIP() + "주소의 " );
//		print();	
	//교수님 코드
	public void printProperty() {
		System.out.print("나의 IPTV는 " + ip + "주소의 ");
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
