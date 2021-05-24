import java.util.ArrayList;

interface IStack<T> {
	T pop();
	boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
	ArrayList<T> I = null;
	public MyStack() {
		I = new ArrayList<T>();
	}
	@Override
	public T pop() {
		if(I.size() == 0)
			return null;
		else
			return I.remove(0);
	}
	@Override
	public boolean push(T ob) {
		I.add(0, ob);
		return true;
	}
}


public class Ch07_Practice_09 {

	public static void main(String[] args) {
		IStack<Integer> stack = new MyStack<Integer>();
		for(int i=0; i<10; i++)
			stack.push(i);
		while(true) {
			Integer n = stack.pop();
			if(n==null) 
				break;
			System.out.print(n + " ");
		}
	}

}
