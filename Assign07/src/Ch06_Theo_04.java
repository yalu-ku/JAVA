
public class Ch06_Theo_04 {
	
	public static void main(String[] args) {
		java.util.StringTokenizer st = new java.util.StringTokenizer("a=3,b=5,c=6",",=");
		int sum = 0;
		while (st.hasMoreTokens()) {
			String next = st.nextToken();
			try {
				sum += Integer.parseInt(next);
				System.out.println(next);
			}
			catch(NumberFormatException e) {
				System.out.println(next);
			}
		}
		System.out.println("гую╨ "+sum);
	}

}
