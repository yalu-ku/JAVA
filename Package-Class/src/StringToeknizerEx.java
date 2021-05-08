import java.util.StringTokenizer;

public class StringToeknizerEx {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}
