import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
    JTextField userText = new JTextField(20);
    JPasswordField passwordText = new JPasswordField(20);

    public LoginGUI() {
        JFrame loginFrame = new JFrame();
        JPanel login = new JPanel();
        JLabel userLabel = new JLabel("User");

        login.setBorder(BorderFactory.createEmptyBorder(80, 160, 80, 160));
        login.setLayout(new GridLayout(3, 2));

        userLabel.setBounds(10,20,80,25);
        login.add(userLabel);


        userText.setBounds(100,20,165,25);
        login.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        login.add(passwordLabel);

        passwordText.setBounds(100,50,165,25);
        login.add(passwordText);

        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 40, 40, 25);
        loginButton.addActionListener(this);
        login.add(loginButton);

        loginFrame.add(login);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginFrame.setTitle("Login");
        loginFrame.pack();
        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String accountNumber = passwordText.getText();

        // findAccount
    }
}
