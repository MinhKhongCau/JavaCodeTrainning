import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangeLabelExample extends JFrame {
    private JLabel notice; // Declare JLabel
    private JButton changeButton; // Declare JButton

    public ChangeLabelExample() {
        // Set up JFrame
        setTitle("Change JLabel Content Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Initialize the JLabel
        notice = new JLabel("Initial Text", SwingConstants.CENTER);
        notice.setFont(new Font("Arial", Font.BOLD, 20));
        notice.setForeground(Color.BLUE);

        // Initialize the JButton
        changeButton = new JButton("Change Label Text");
        changeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeLabelText("New Text Set!");
            }
        });

        // Add components to the panel
        add(notice, BorderLayout.CENTER);
        add(changeButton, BorderLayout.SOUTH);
    }

    // Method to change the label text
    private void changeLabelText(String newText) {
        notice.setText(newText); // Change the label text
        notice.repaint(); // Request a repaint (optional, often not needed)
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ChangeLabelExample frame = new ChangeLabelExample();
            frame.setVisible(true);
        });
    }
}
