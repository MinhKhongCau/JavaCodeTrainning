import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

public class N22DCCN053_EX12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Xin chao D22CQCN02");
        frame.setLocationByPlatform(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        frame.setSize((int) d.getWidth()/3,(int)d.getHeight()/3);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}