import java.util.Scanner;

public class Ch03_Prac_14 {

	public static void main(String[] args) {
		String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score [] = {95, 88, 76, 62, 55};
		
		Scanner scan = new Scanner(System.in);

		while(true) {
//			int idx=-1;
			System.out.print("과목 이름>>");
			String input = scan.next();
			
			if(input.equals("그만")) 
				break;
			
			for(int i=0; i<course.length; i++) {
				if(course[i].equals(input)) {
					System.out.println(course[i]+"의 점수는 "+score[i]);
//					idx = i;
					break;
				}
				else if (i == course.length-1)
					System.out.println("없는 과목입니다.");
			}
			
//			if(idx == -1)
//				System.out.println("없는 과목입니다.");
//			else{
//				System.out.println(course[idx]+"의 점수는 "+score[idx]);
//			}
			
		}
		scan.close();
	}
}
		
	
