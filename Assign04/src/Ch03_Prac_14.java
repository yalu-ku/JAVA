import java.util.Scanner;

public class Ch03_Prac_14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);

		while(true) {
//			int idx=-1;
			System.out.print("���� �̸�>>");
			String input = scan.next();
			
			if(input.equals("�׸�")) 
				break;
			
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(input)) {
					System.out.println(course[i]+"�� ������ "+score[i]);
//					idx = i;
					break;
				}
				else if (i == course.length-1)
					System.out.println("���� �����Դϴ�.");
			}
			
//			if(idx == -1)
//				System.out.println("���� �����Դϴ�.");
//			else{
//				System.out.println(course[idx]+"�� ������ "+score[idx]);
//			}
			
		}
		scan.close();
	}
}
		
	
