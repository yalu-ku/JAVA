import java.util.*;

public class Ch07_Practice_08 {

	public static void main(String[] args) {
		HashMap<String, Integer> manage = new HashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("** ����Ʈ ���� ���α׷��Դϴ� **");
		while(true) {
			System.out.print("�̸��� ����Ʈ �Է� >> ");
			String name = scan.next();
			if(name.equals("�׸�"))
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
