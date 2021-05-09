import java.util.Scanner;

public class Ch06_Prac_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. 빈칸 영어 한글 모두 가능");
		String st = sc.nextLine();
		
		for (int i=0; i<st.length(); i++) {
			System.out.print(st.substring(i+1));
			for(int j=0;j<=i;j++)
				System.out.print(st.charAt(j));
			System.out.println();
		}
	}
}
