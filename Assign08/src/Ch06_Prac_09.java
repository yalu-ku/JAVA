import java.util.Scanner;

// ���������� ����
public class Ch06_Prac_09 {

	public static void main(String[] args) {
		int Com = 0;
//		String S, R, P;
		
		
//		if(Com == 1)
//			S = "����";
//		if(Com == 2)
//			R = "����";
//		if(Com == 3)
//			P = "��";	

	
//		boolean test = true;
		Scanner scan = new Scanner(System.in);
		while(true) {
			for(int i=0; i<3; i++) {
				Com = (int)(Math.random()*3 + 1);
			}
			System.out.print("ö��[����(1), ����(2), ��(3), ������(4)]>>");
			int Chul = scan.nextInt();
			if(Chul == 4)
				break;
//			System.out.println("��ǻ�� : " + Com);
			if(Chul == Com)
				System.out.println("�����ϴ�.");
			
			switch(Chul) {
			case 1 : 
				if(Com == 2) {
					System.out.println("ö��(����) : ��ǻ��(����)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				if(Com == 3) {
					System.out.println("ö��(����) : ��ǻ��(��)");
					System.out.println("ö���� �̰���ϴ�.");
				}
//				if(Com == 1) 
//					System.out.println("�����ϴ�.");
				break;
			case 2 :
				if(Com == 1) {
					System.out.println("ö��(����) : ��ǻ��(����)");
					System.out.println("ö���� �̰���ϴ�.");
				}
				if(Com == 3) {
					System.out.println("ö��(����) : ��ǻ��(��)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
//				if(Com == 2)
//					System.out.println("�����ϴ�.");
				break;
			case 3 :
				if(Com == 1) {
					System.out.println("ö��(��) : ��ǻ��(����)");
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
				}
				if(Com == 2) {
					System.out.println("ö��(��) : ��ǻ��(����)");
					System.out.println("ö���� �̰���ϴ�.");
				}
//				if(Com == 3)
//					System.out.println("�����ϴ�.");
//				break;
//			case 4 :
//				break;

			}
		}
		scan.close();
	}
}
