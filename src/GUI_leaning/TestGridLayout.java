package GUI_leaning;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestGridLayout {

	public static void main(String[] args) {
		JFrame f = new JFrame("vell001");
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		f.setLayout(new GridLayout(2,2));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.pack();
		f.setVisible(true);
	}

}
