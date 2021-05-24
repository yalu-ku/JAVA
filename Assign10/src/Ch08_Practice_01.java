import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ch08_Practice_01 {

	public static void main(String[] args) {
		FileWriter phone = null;
		File file = new File("C:\\temp\\phone.txt");
		try {
			phone = new FileWriter(file);
			Scanner scan = new Scanner(System.in);
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {
				System.out.print("이름 전화번호 >> ");
				String line = scan.nextLine();
				if(line.equals("그만"))
					break;
				phone.write(line + "\r\n");
			}
			System.out.println(file.getPath() + "에 저장하였습니다.");
			scan.close();
			phone.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
