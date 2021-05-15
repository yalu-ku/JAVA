import java.util.Vector;

class Point {
	private int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 'toString ������' [6��]
	public String toString() {
		return "(" + x + "," + y + ")";
	}
};


public class PointVectorEx {

	public static void main(String[] args) {
		// Point ��ü�� ��ҷθ� ������ ���� ����
		// () == default == 10
		Vector<Point> v = new Vector<Point>();
		
		// 3���� Point ��ü ����
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		// ���Ϳ� �ִ� Point ��ü ��� �˻��Ͽ� ���
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i); // ���Ϳ��� i��° Point ��ü�� get() �޼ҵ带 Ȱ���Ͽ� ����
			System.out.println(p); // p.toString()�� �̿��Ͽ� ��ü p ���
		}
	}

}
