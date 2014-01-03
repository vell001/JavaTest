package GUI_leaning;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestActionListener {

	public static void main(String[] args) {
		JFrame f = new JFrame("vell001");
		JButton b1 = new JButton("b1");
		JButton b2 = new JButton("b2");
		JButton b3 = new JButton("b3");
		JButton b4 = new JButton("b4");
		final JTextField tf1 = new JTextField("test");
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf1.setText("adsfadsf");
			}
		});
		f.setLayout(new GridLayout(2,3));
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(tf1);
		f.pack();
		f.setVisible(true);
	}

}
