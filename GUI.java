import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button1 = new JButton("Create a new account");
    JButton button2 = new JButton("Log into an existing account");
    public GUI() {
        button1.addActionListener(this);
        button2.addActionListener(this);

        JLabel label = new JLabel("Welcome to the Strawberry Bank: Banking App");

        panel.setBorder(BorderFactory.createEmptyBorder(160, 320, 160, 320));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        panel.add(button1);
        panel.add(button2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            // new SignupGUI;
        } else {
            frame.setVisible(false);
            new LoginGUI();
        }

    }


    public static void main(String[] args) {
        new GUI();
    }
}
