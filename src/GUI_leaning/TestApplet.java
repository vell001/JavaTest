package GUI_leaning;

import java.applet.Applet;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

public class TestApplet {

	public static void main(String[] args) throws MalformedURLException {
		JFrame f = new JFrame();
		Applet a = new Applet();
		a.getAppletContext().showDocument(new URL("http://www.baidu.com"));
		f.add(a);
		f.setVisible(true);
	}
}
