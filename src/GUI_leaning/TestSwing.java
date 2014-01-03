package GUI_leaning;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class TestSwing {

	public static void main(String[] args) {
		final JFrame f = new JFrame("test4");
		f.setLayout(new FlowLayout());
		String[] s = {"100*100","200*200","300*300","400*400","500*500"};
		JComboBox cb = new JComboBox(s);
		cb.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED){
					String item = (String)e.getItem();
					int w = Integer.parseInt(item.substring(0, item.indexOf("*")));
					int h = Integer.parseInt(item.substring(item.indexOf("*")+1));
					f.setSize(w, h);
				}
			}
		});
		
		final JRadioButton[] rbs = {new JRadioButton("红色", true),new JRadioButton("绿色", false),
				new JRadioButton("蓝色", false),new JRadioButton("黄色", false)};
		ButtonGroup bg = new ButtonGroup();
		
		for(int i=0; i<rbs.length; i++){
			f.add(rbs[i]);
			bg.add(rbs[i]);
			rbs[i].addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					for (int i = 0; i < rbs.length; i++) {  
				        if (e.getSource() == rbs[i]) {
				        	if(i == 0)
				        		f.getContentPane().setBackground(Color.RED);
				        	else if(i == 1)
				        		f.getContentPane().setBackground(Color.GREEN);
				        	else if(i == 2)
				        		f.getContentPane().setBackground(Color.BLUE);
				        	else if(i == 3)
				        		f.getContentPane().setBackground(Color.YELLOW);
				        }  
				    }
				}
			});
		}
		
		f.add(cb);
		f.setSize(100, 200);
		f.getContentPane().setBackground(Color.RED);
		f.setVisible(true);
	}
}
