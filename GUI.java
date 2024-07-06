import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    JButton button1 = new JButton("Create a new account");
    JButton button2 = new JButton("Log into an existing account");
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    public GUI() {
        startUp();
    }

    public void startUp() {

        button1.addActionListener(this);
        button2.addActionListener(this);

        JLabel label = new JLabel("Welcome to the Strawberry Bank: Banking App");

        // the order of the numbs r top bottom left right
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

    public void signUp() {

    }

    public void login() {
        frame.getContentPane().removeAll();
        JLabel userLabel = new JLabel("User");

        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Creating login button
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button1) {
            signUp();
        } else {
            login();
        }

    }

    public static void main(String[] args) {
        new GUI();
    }
}
