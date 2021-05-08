
public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		sb.append(" is pencil");
		System.out.println(sb);	//This is pencil
		
		sb.insert(7, " my");
		System.out.println(sb);	//This is my pencil
		
		// 8~10����! �� 8~9
		sb.replace(8, 10, "your");
		System.out.println(sb);	//This is your pencil
		
		// 8~13����! �� 8~12
		sb.delete(8, 13);
		System.out.println(sb);	
		
		// 4ĭ����, ������ �ڴ� ����
		// 4ĭ == [ 0 1 2 3 ]
		sb.setLength(4);
		System.out.println(sb);	//This
		
	}

}
