import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.AbstractButton;
import java.lang.Integer;

public class Add {
    public static void main(String[] args) {
        Addition obj = new Addition();
    }
}

// Using anonymous class to pass through actionListener
class Addition extends JFrame {
    JTextField t1, t2;
    JButton b;
    JLabel l;

    public Addition () {
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("OK");
        l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        // Creating ActionListener object
        // ActionListener al = new ActionListener() { //ActionListener is an interface, hence we give implementation by including Function body
        //     public void actionPerformed(ActionEvent ae) {
        //         System.out.println("Pressed");
        //         int num1 = Integer.parseInt(t1.getText());
        //         int num2 = Integer.parseInt(t2.getText());

        //         int value = num1 + num2;
        //         l.setText(value + "");
        //     }
        // };

        // Passing object directly as it's only used once
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Pressed");
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());

                int value = num1 + num2;
                l.setText(value + "");
            }
        });

        setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

// Implementiong ActionListener interface
// class Addition extends JFrame implements ActionListener {
//     JTextField t1, t2;
//     JButton b;
//     JLabel l;

//     public Addition () {
//         t1 = new JTextField(20);
//         t2 = new JTextField(20);
//         b = new JButton("OK");
//         l = new JLabel("Result");

//         add(t1);
//         add(t2);
//         add(b);
//         add(l);

//         b.addActionListener(this);

//         setLayout(new FlowLayout());
// 		setVisible(true);
// 		setSize(400, 400);
// 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//     }

//     public void actionPerformed(ActionEvent ae) {
//         System.out.println("Pressed");
//         int num1 = Integer.parseInt(t1.getText());
//         int num2 = Integer.parseInt(t2.getText());

//         int value = num1 + num2;
//         l.setText(value + "");
//     }
// }