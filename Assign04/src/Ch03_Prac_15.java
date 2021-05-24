import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch03_Prac_15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				int n = scan.nextInt();
				int m = scan.nextInt();
				System.out.println(n + "x" + m + "=" + n*m);
				break;
			}
			catch(InputMismatchException e) {
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scan.nextLine();
			}
			
		}
			
		scan.close();
	}
}


