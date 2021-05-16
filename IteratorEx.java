import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	// hasNext�� next ������ *
	public static void main(String[] args) {
		// ���� ���� �ٷ�� ���׸� ���� ����
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		// Iterator�� �̿��� ��� ���� ����ϱ�
		Iterator<Integer> it = v.iterator(); // Iterator ��ü ���
		while(it.hasNext()) {
			int n = it.next();
			// it�� hash code���� Ȯ���ϴ� �ڵ� (��� : ��� ����)
			System.out.println("it: " + it);
			System.out.println(n);
			System.out.println("==========================");
		}
		
		int sum = 0;
		it = v.iterator(); // Iterator ��ü ���, ���� it�� ��ġ�� v�� ����Ű�� ������ '������' ��ġ�̱� ������ ���� ����!
		while(it.hasNext()) { // Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
			int n = it.next();
			sum += n;
		}
		System.out.println("���Ϳ� �ִ� ���� �� : " + sum);
	}

}
