import java.util.*;

public class HashMapDicEx {

	public static void main(String[] args) {
		// ���� �ܾ�� �ѱ� �ܾ��� ���� �����ϴ� HashMap �÷��� ����
		HashMap<String, String> dic = new HashMap<String, String>();
		
		// 3���� (key, value) ���� dic�� ����
		dic.put("baby", "�Ʊ�");
		dic.put("love", "���");
		dic.put("apple", "���");
		
		// dic �÷����� ��� �ִ� ��� (key, value) �� ���
		Set<String> keys = dic.keySet(); // key ���ڿ��� ���� Set ����
		Iterator<String> it = keys.iterator();
		while( it.hasNext() ) {
			String key = it.next();
			String value = dic.get(key);
			System.out.println("(" + key + "," + value + ")");
		}
		
		// ���� �ܾ �Է� �ް�, �ѱ� �ܾ� �˻�
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã�� ���� �ܾ��?");
			String eng = scanner.next();
			
			if( eng.equals("exit") ) {
				System.out.println("�����մϴ�...");
				break;
			}
			
			// �ؽøʿ��� 'Ű' eng�� '��' kor �˻�
			String kor = dic.get(eng);
			if( kor == null )
				System.out.println(eng + "�� ���� �ܾ��Դϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}

}
