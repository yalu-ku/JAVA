class GStack<T> {
	int tos;
	Object [] stck; // 제네릭에서는 제네릭 타입으로 배열 생성할 수 없음
	public GStack() {
		tos = 0;
		stck = new Object [10]; // 제네릭에서는 제네릭 타입으로 배열 생성할 수 없음
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
	//T가 타입 매개 변수인 제네릭 메소드
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
		// Double 타입의 GStack 생성
		GStack<Double> gs = new GStack<Double>();
		
		// 5개의 요소를 스택에 push
		for (int i=0; i<5; i++) {
			gs.push(new Double(i));
		}
		gs = reverse(gs);
		for (int i=0; i<5; i++) {
			System.out.println(gs.pop());
		}
	}

}
