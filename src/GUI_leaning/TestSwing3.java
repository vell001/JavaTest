package GUI_leaning;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 * @author VellBibi
 *用Swing包来实现一个窗体，要求如下：
 *窗体的初始大小为500*500；
 *窗体中包含一个下拉框，该下拉框包含（按钮1、按钮2、按钮3）：位置（60,60），大小（90,30）；
 *窗体中包含一个按钮（初始文本为“按钮”）：位置（150,60），大小（80,30）；
 *用监听事件实现当选择不同下拉框不同的选项时，按钮上的文本显示为对应的文本；
 *用监听事件实现当最小化窗口时，通过消息框显示“您正在最小化窗口”。
 */
public class TestSwing3 {

	public static void main(String[] args) {
		final JFrame f = new JFrame("vell001-VellBibi");
		f.setLayout(null);
		String[] str = new String[]{"按钮1","按钮2","按钮3"};
		JComboBox cb = new JComboBox(str);
		cb.setBounds(60, 60, 90, 30);
		
		final JButton bt = new JButton("按钮");
		bt.setBounds(150, 60, 80, 30);
		
		final JDialog dl = new JDialog(f,"您正在最小化窗口");
		JLabel l = new JLabel("您正在最小化窗口!!!");
		dl.add(l);
		dl.setSize(200, 100);
		
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					String item = (String)e.getItem();
					bt.setText(item);
				}
			}
		});
		
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				dl.setVisible(true);//显示dialog
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		f.add(cb);
		f.add(bt);
		f.setSize(500, 500);
		f.setVisible(true);
	}

}
