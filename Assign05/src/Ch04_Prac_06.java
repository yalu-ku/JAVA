import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public int getR() {
		return radius;
	}
}

public class Ch04_Prac_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle circle[] = new Circle[3];
		for(int i=0; i<circle.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			circle[i] = new Circle(x, y, radius);
		}
		int temp = 0;
		for(int i=1; i<circle.length; i++) {
			if(circle[temp].getR() < circle[i].getR())
				temp = 1;
		}
		System.out.println("가장 면적이 큰 원은 ");
		circle[temp].show();
		scanner.close();
	}

}
