package GUI_leaning;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TestSwing2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setLayout(null);
		JButton bt1 = new JButton("确定");
		bt1.setBounds(40, 50, 100, 50);
		final JLabel l1 = new JLabel("标签1");
		l1.setBounds(150, 50, 300, 50);
		
		bt1.addMouseListener(new MouseListener() {//鼠标事件监听
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				l1.setText("标签1");
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				l1.setText("进入按钮上方");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		f.add(bt1);
		f.add(l1);
		
		f.setSize(400, 200);
		f.setVisible(true);
	}

}
