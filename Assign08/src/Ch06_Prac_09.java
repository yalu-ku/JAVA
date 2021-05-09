import java.util.Scanner;

// 가위바위보 게임
public class Ch06_Prac_09 {

	public static void main(String[] args) {
		int Com = 0;
//		String S, R, P;
		
		
//		if(Com == 1)
//			S = "가위";
//		if(Com == 2)
//			R = "바위";
//		if(Com == 3)
//			P = "보";	

	
//		boolean test = true;
		Scanner scan = new Scanner(System.in);
		while(true) {
			for(int i=0; i<3; i++) {
				Com = (int)(Math.random()*3 + 1);
			}
			System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
			int Chul = scan.nextInt();
			if(Chul == 4)
				break;
//			System.out.println("컴퓨터 : " + Com);
			if(Chul == Com)
				System.out.println("비겼습니다.");
			
			switch(Chul) {
			case 1 : 
				if(Com == 2) {
					System.out.println("철수(가위) : 컴퓨터(바위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				if(Com == 3) {
					System.out.println("철수(가위) : 컴퓨터(보)");
					System.out.println("철수가 이겼습니다.");
				}
//				if(Com == 1) 
//					System.out.println("비겼습니다.");
				break;
			case 2 :
				if(Com == 1) {
					System.out.println("철수(바위) : 컴퓨터(가위)");
					System.out.println("철수가 이겼습니다.");
				}
				if(Com == 3) {
					System.out.println("철수(바위) : 컴퓨터(보)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
//				if(Com == 2)
//					System.out.println("비겼습니다.");
				break;
			case 3 :
				if(Com == 1) {
					System.out.println("철수(보) : 컴퓨터(가위)");
					System.out.println("컴퓨터가 이겼습니다.");
				}
				if(Com == 2) {
					System.out.println("철수(보) : 컴퓨터(바위)");
					System.out.println("철수가 이겼습니다.");
				}
//				if(Com == 3)
//					System.out.println("비겼습니다.");
//				break;
//			case 4 :
//				break;

			}
		}
		scan.close();
	}
}
