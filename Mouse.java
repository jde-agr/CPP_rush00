import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mouse {
    public static void main(String[] args) {
        MouseDemo obj = new MouseDemo();
    }
}

class MouseDemo extends JFrame {
    public MouseDemo() {
        addMouseListener(new MouseAdapter() { //Don't use new MouseListener() as we would need to implement all methods (mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited)
            // Overriding mousePressed method
            public void mousePressed(MouseEvent me) {
                int x = me.getX();
                int y = me.getY();
                System.out.println("X: " + x + "\tY: " + y);
            }
        });
        
        setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}