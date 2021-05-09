
public class Ch06_Theo_06 {

	public static void main(String[] args) {
		String s1 = Integer.toString(20);
		System.out.println(s1);
		System.out.println(s1.getClass().getName());
		
		double d = Double.parseDouble("35.9");
		System.out.println(d);
//		System.out.println(d instanceof d);

//		boolean b = Boolean.toString("true");
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		String s2 = Integer.toBinaryString(30);
		System.out.println(s2);
		
		String c = Character.toString('c');
		System.out.println(c);
		
		// 10¹ø
		System.out.println(3 + Integer.valueOf(5));
	
		 if('c' == Character.valueOf('c'))
			 System.out.println('c');
	}

}
