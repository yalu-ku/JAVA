import javax.swing.*;
import java.awt.*;

public class paintComponentEx extends JFrame {

	public paintComponentEx() {
		setTitle("���ο� ��ư �����");
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
			super(s); //JButton�� ������ ȣ��
		}
		
		// ���ο� ��ư �׸���
		public void paintComponent(Graphics g) {
			super.paintComponent(g); // �⺻ ��ư
			
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
			
		}
	}
	
	public static void main(String[] args) {
		new paintComponentEx();
	}

}