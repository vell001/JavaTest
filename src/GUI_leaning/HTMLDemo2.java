package GUI_leaning;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

final class HTMLDemo2 extends JFrame {
    public String getTitle() {return "html demo";}
    static private final Dimension size = new Dimension(600, 400);
    public Dimension getPreferredSize() {return size;}
    public Dimension getMaximumSize() {return size;}
    public Dimension getMinimumSize() {return size;}
    public Dimension getSize() {return size;}
    private String u;
    HTMLDemo2(String url) throws HeadlessException {
        u=url;
        attachListeners();
        doLay();
    }
    private void attachListeners() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void doLay() {
        Container container = getContentPane();
    try {
            container.add(new JScrollPane(new JEditorPane("text/html",u)));
        } catch(Exception e) {
            e.printStackTrace();
        }
        pack();
        setVisible(true);
    }
    public static void main(final String[] args) {
    	JEditorPane editorPane = new JEditorPane();
        try {
			editorPane.setPage("http://www.baidu.com");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        editorPane.setEditable(false);
        editorPane.setLayout(new GridBagLayout());
        editorPane.setContentType("text/html");
        JFrame f = new JFrame();
        f.add(editorPane);
        f.pack();
        f.setVisible(true);
    }
}
