import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgBar {
    public static void main(String[] args) {
        ProgressBar obj = new ProgressBar();
    }
}

class ProgressBar extends JFrame implements ActionListener {
    int i;
    JProgressBar p;

    public ProgressBar() {
        JButton b = new JButton("ADD Form");
        p = new JProgressBar(0, 20);
        i = 0;
        Timer t = new Timer(250, this);

        add(b);
        add(p);

        b.addActionListener(ae -> {
            t.start();
        });

        setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        if (i == 20) {
            new Addition();
            dispose();
        }
        i++;
        p.setValue(i);
    }
}