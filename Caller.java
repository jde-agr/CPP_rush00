import java.awt.*;
import javax.swing.*;

public class Caller {
    public static void main(String[] args) {
        Call obj = new Call();
    }
}

class Call extends JFrame {
    public Call() {
        JButton b = new JButton("Add Form");

        add(b);
        b.addActionListener(ae -> {
            new Addition();
            dispose();
        });

        setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}