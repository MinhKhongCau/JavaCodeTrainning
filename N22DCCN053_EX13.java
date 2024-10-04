import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class N22DCCN053_EX13 {
    
    private static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("Button Frame");
        frame.setLocationByPlatform(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        frame.setSize((int) d.getWidth()/3,(int)d.getHeight()/3);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JButton btnA = new JButton("btnA");
        JButton btnB = new JButton("btnB");
        btnA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                frame.setTitle("btnA");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        btnB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                frame.setTitle("btnB");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });
        JPanel panel = new JPanel();
        panel.add(btnA);
        panel.add(btnB);
        frame.add(panel);
    }
}


