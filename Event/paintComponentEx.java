import javax.swing.*;
import java.awt.*;

public class paintComponentEx extends JFrame {

	public paintComponentEx() {
		setTitle("새로운 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		MyButton b = new MyButton("New Button");
		b.setOpaque(true); //?
		b.setBackground(Color.CYAN);
		c.add(b);
		setSize(250,200);
		setVisible(true);
	}
	
	class MyButton extends JButton {
		public MyButton(String s) {
			super(s); //JButton의 생성자 호출
		}
		
		// 새로운 버튼 그리기
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // 기본 버튼
			
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
			
		}
	}
	
	public static void main(String[] args) {
		new paintComponentEx();
	}

}
