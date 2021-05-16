import java.util.Iterator;
import java.util.Vector;

public class IteratorEx {
	// hasNext와 next 차이점 *
	public static void main(String[] args) {
		// 정수 값만 다루는 제네릭 벡터 생성
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		// Iterator를 이용한 모든 정수 출력하기
		Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기
		while(it.hasNext()) {
			int n = it.next();
			// it의 hash code값을 확인하는 코드 (결과 : 모두 동일)
			System.out.println("it: " + it);
			System.out.println(n);
			System.out.println("==========================");
		}
		
		int sum = 0;
		it = v.iterator(); // Iterator 객체 얻기, 현재 it의 위치가 v가 가리키는 벡터의 '마지막' 위치이기 때문에 새로 얻음!
		while(it.hasNext()) { // Iterator를 이용하여 모든 정수 더하기
			int n = it.next();
			sum += n;
		}
		System.out.println("벡터에 있는 정수 합 : " + sum);
	}

}
