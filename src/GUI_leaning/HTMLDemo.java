package GUI_leaning;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

final class HTMLDemo extends JFrame {
    public String getTitle() {return "html demo";}
    static private final Dimension size = new Dimension(600, 400);
    public Dimension getPreferredSize() {return size;}
    public Dimension getMaximumSize() {return size;}
    public Dimension getMinimumSize() {return size;}
    public Dimension getSize() {return size;}
    private String u;
    HTMLDemo(String url) throws HeadlessException {
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
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {new HTMLDemo("HTMLDemo.html");}
        });
    }
}
