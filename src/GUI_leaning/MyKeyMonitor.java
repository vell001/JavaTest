package GUI_leaning;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MyKeyMonitor extends KeyAdapter{

	@Override
	public void keyTyped(KeyEvent e) {
		e.setKeyCode(KeyEvent.CHAR_UNDEFINED);
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println(e.getKeyChar());
		e.setKeyChar(KeyEvent.CHAR_UNDEFINED);
		e.setKeyCode(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		e.setKeyCode(KeyEvent.CHAR_UNDEFINED);
	}
	
}
