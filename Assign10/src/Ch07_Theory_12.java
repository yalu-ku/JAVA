class JGenClass {
	static <T> T take(T s[], int index) {
		if(index > s.length) {
			System.out.println("�ε����� ������ ������ϴ�.");
			return null;
		}
		return s[index];
	}
}
public class Ch07_Theory_12 {

	public static void main(String[] args) {
		String [] s = {"Java", "Programming"};
		System.out.println(JGenClass.take(s, 3));
		Integer [] n = {1,2,3,4,5};
		System.out.println(JGenClass.take(n, 4));
	}

}
