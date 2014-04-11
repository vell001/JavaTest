package GUI_leaning;

import java.awt.Image;
import java.io.File;

import javax.swing.JFrame;

public class TestFullScreen {
	public static void main(String[] args) {
		JFrame f = new JFrame("Please take a rest...By Vell001");
//		Image image = getImage("D:\\Picture\\WallPaper\\002.jpg");
		f.addKeyListener(new MyKeyMonitor());
		f.setBounds(0, 0, 1366, 768);
		f.setAlwaysOnTop(true);
		f.setUndecorated(true);
		f.setResizable(false);
		f.setVisible(true);
	}
}
