class GStack<T> {
	int tos;
	Object [] stck; // ���׸������� ���׸� Ÿ������ �迭 ������ �� ����
	public GStack() {
		tos = 0;
		stck = new Object [10]; // ���׸������� ���׸� Ÿ������ �迭 ������ �� ����
	}
	public void push(T item) {
		if(tos == 10)
			return;
		stck[tos] = item;
		tos++; 
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}

class GenericMethodEx {
	static <T> void toStack (T[] a, GStack<T> gs) {
		for (int i=0; i<a.length; i++) {
			gs.push(a[i]);
		}
	}
}

public class GenericMethodExample {
	//T�� Ÿ�� �Ű� ������ ���׸� �޼ҵ�
	public static <T> GStack<T> reverse(GStack<T> a) {
		GStack<T> s = new GStack<T>();
		while (true) {
			T tmp;
			tmp = a.pop();
			if (tmp==null)
				break;
			else
				s.push(tmp);
		}
		return s;
	}

	public static void main(String[] args) {
		// Double Ÿ���� GStack ����
		GStack<Double> gs = new GStack<Double>();
		
		// 5���� ��Ҹ� ���ÿ� push
		for (int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}

}
