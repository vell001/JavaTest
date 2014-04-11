package GUI_leaning;

import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SWTBrowser2 {

	public static void main(String args[]) {
		Display display = new Display();
		Shell shell = new Shell(SWT.NO_TRIM);
		shell.setText("SWT Browser Test");
		shell.setBounds(Display.getDefault().getPrimaryMonitor().getBounds());

		final Browser browser = new Browser(shell, SWT.FILL);
		browser.setBounds(shell.getBounds());

		browser.setUrl(System.getProperty("user.dir")
				+ "/html/SWTBrowser2.html");
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}
