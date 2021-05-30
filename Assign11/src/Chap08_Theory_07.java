import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Chap08_Theory_07 {
	public static void main(String[] args) {
		File src = new File("C:\\Users\\YaluAro\\eclipse-workspace\\Assign11\\a.jpg");
		File dest = new File("C:\\Users\\YaluAro\\eclipse-workspace\\Assign11\\b.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			int count = 0;
			long size = src.length();
//			System.out.println(src.length());
			System.out.println(src.getName() + "를 " + dest.getName() + "로 복사합니다.");
			System.out.println("10%마다 *를 출력합니다.");
			while((c = fi.read()) != -1) {
				if(++count%(size/10)==0)
					System.out.print("*");
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			} catch (IOException e) {
				System.out.println("파일 복사 오류");
			}
	}
}
