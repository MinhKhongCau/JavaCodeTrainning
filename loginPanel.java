import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;

public class loginPanel extends JPanel {
    private JLabel labelTitle;
    private JLabel labelNickName;
    private JTextField textNickName;
    private JButton buttonStart;
    
    public loginPanel() {
        setSize(400,300);
        setBackground(new java.awt.Color(54, 66, 66));
        setForeground(java.awt.Color.darkGray);
        
        labelTitle = new JLabel();
        labelTitle.setBackground(new java.awt.Color(153, 153, 153));
        labelTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTitle.setText("BREAK OUT BALL GAME");

        labelNickName = new JLabel("Nick name: ");
        labelNickName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        textNickName = new JTextField();
        
        JPanel content = new JPanel();

        buttonStart.setText("Get started");
        buttonStart.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                        buttonStartActionPerformed(evt);
                }
        });


        }
        private void buttonStartActionPerformed(ActionEvent e) {
                
        }

}
