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
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = scan.nextLine();
				if(line.equals("�׸�"))
					break;
				phone.write(line + "\r\n");
			}
			System.out.println(file.getPath() + "�� �����Ͽ����ϴ�.");
			scan.close();
			phone.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
