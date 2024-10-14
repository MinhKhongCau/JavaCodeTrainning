import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class N22DCCN053_EX14 {
    public static void main(String[] args) {
        JFrame menuFrame = new JFrame("Menu Test");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setResizable(true);
        menuFrame.setLocationByPlatform(true);
        menuFrame.setSize(300, 400);
        
        // create panel
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 300, 600);
        panel.setSize(400, 300);

        // create menu
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        openMenuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        menuFrame.setJMenuBar(menuBar);
        menuFrame.add(panel);
        menuFrame.pack();
        menuFrame.setVisible(true);
    }
}
