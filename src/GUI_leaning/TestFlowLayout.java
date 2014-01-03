package GUI_leaning;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFlowLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("vell001");
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		f.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
