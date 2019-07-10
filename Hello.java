//package frameEx;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Hello {
	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.setVisible(true);
		obj.setSize(400, 400);
	}
}

class Abc extends JFrame {
	public Abc() {
		JLabel l = new JLabel("Hello World");
		JLabel l1 = new JLabel("Welcome back");

		add(l);
		add(l1);

		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
