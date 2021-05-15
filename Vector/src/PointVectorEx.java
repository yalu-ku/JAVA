import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 'toString 재정의' [6장]
	public String toString() {
		return "(" + x + "," + y + ")";
	}
};


public class PointVectorEx {

	public static void main(String[] args) {
		// Point 객체를 요소로만 가지는 벡터 생성
		// () == default == 10
		Vector<Point> v = new Vector<Point>();
		
		// 3개의 Point 객체 삽입
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		// 벡터에 있는 Point 객체 모두 검색하여 출력
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // 벡터에서 i번째 Point 객체를 get() 메소드를 활용하여 얻어내기
			System.out.println(p); // p.toString()을 이용하여 객체 p 출력
		}
	}

}
