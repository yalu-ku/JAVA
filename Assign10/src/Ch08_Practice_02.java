import java.io.*;
public class Ch08_Practice_02 {

	public static void main(String[] args) {
		File f = new File("C:\\Temp\\phone.txt");
		try {
			System.out.println(f.getPath() + "를 출력합니다.");
			BufferedReader read = new BufferedReader(new FileReader(f));
			String line = "";
			while((line = read.readLine()) != null) {
				System.out.println(line);
			}
				
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
