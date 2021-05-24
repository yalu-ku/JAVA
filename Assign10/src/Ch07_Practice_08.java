import java.util.*;

public class Ch07_Practice_08 {

	public static void main(String[] args) {
		HashMap<String, Integer> manage = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("** 포인트 관리 프로그램입니다 **");
		while(true) {
			System.out.print("이름과 포인트 입력 >> ");
			String name = scan.next();
			if(name.equals("그만"))
				break;
			int point = scan.nextInt();
			if(manage.get(name)==null)
				manage.put(name, point);
			else 
				manage.put(name, manage.get(name) + point);
			Set<String> key = manage.keySet();
			Iterator<String> it = key.iterator();
			while(it.hasNext()) {
				String customer = it.next();
				Integer sum = manage.get(customer);
				System.out.print("(" + customer + "," + sum + ")");
			}
			System.out.println();
		}
		scan.close();
	}
}
