import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends Main implements ActionListener {
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
            frame.setVisible(false);
            JFrame signupFrame = new JFrame();
            JPanel signup = new JPanel();
            JLabel nameLabel = new JLabel("Full Name");
            JLabel depositNumber = new JLabel("Deposit");
            JTextField userName = new JTextField(20);
            JTextField initialDeposit = new JTextField(20);

            signup.setBorder(BorderFactory.createEmptyBorder(80, 160, 80, 160));
            signup.setLayout(new GridLayout(3, 2));

            nameLabel.setBounds(10,20,80,25);
            signup.add(nameLabel);

            userName.setBounds(100,20,165,25);
            signup.add(userName);

            depositNumber.setBounds(10,20,80,25);
            signup.add(depositNumber);

            initialDeposit.setBounds(100,20,165,25);
            signup.add(initialDeposit);

            JButton signupButton = new JButton("Signup");
            signupButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    /* if (strawberry.accountExists(accountNum)) {
                        JLabel blank = new JLabel("");
                        blank.setBounds(100,50,165,25);
                        login.add(blank);
                        login.add(success);
                        success.setForeground(Color.GREEN);
                        success.setText("Successfully Logged In");
                        mainGUI();
                    } else {
                        JLabel blank = new JLabel("");
                        blank.setBounds(100,50,165,25);
                        login.add(blank);
                        login.add(success);
                        success.setForeground(Color.RED);
                        success.setText("Incorrect Details, Please try again");
                    } */
                }
            });
            signupButton.setBounds(10, 40, 40, 25);
            signupButton.addActionListener(this);
            signup.add(signupButton);

            signupFrame.add(signup);
            signupFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            signupFrame.setTitle("Signup");
            signupFrame.pack();
            signupFrame.setVisible(true);
        } else {
            frame.setVisible(false);
            JFrame loginFrame = new JFrame();
            JPanel login = new JPanel();
            JLabel nameLabel = new JLabel("Full Name");
            JLabel accountLabel = new JLabel("Account Number");
            JTextField userName = new JTextField(20);
            JPasswordField accountNumber = new JPasswordField(20);

            login.setBorder(BorderFactory.createEmptyBorder(80, 160, 80, 160));
            login.setLayout(new GridLayout(4, 2));

            nameLabel.setBounds(10,20,80,25);
            login.add(nameLabel);

            userName.setBounds(100,20,165,25);
            login.add(userName);

            accountLabel.setBounds(10,50,80,25);
            login.add(accountLabel);

            accountNumber.setBounds(100,50,165,25);
            login.add(accountNumber);

            JLabel success = new JLabel("");
            success.setBounds(100,50,165,25);

            JLabel blank = new JLabel("");
            blank.setBounds(100,50,165,25);
            login.add(blank);

            JButton loginButton = new JButton("Login");
            loginButton.setBounds(10, 80, 80, 25);
            loginButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String accountNum = accountNumber.getText();
                    if (strawberry.accountExists(accountNum)) {
                        JLabel blank = new JLabel("");
                        blank.setBounds(100,50,165,25);
                        login.add(blank);
                        login.add(success);
                        success.setForeground(Color.GREEN);
                        success.setText("Successfully Logged In");
                        mainGUI();
                    } else {
                        JLabel blank = new JLabel("");
                        blank.setBounds(100,50,165,25);
                        login.add(blank);
                        login.add(success);
                        success.setForeground(Color.RED);
                        success.setText("Incorrect Details, Please try again");
                    }
                }
            });
            login.add(loginButton);
            loginFrame.add(login);
            loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            loginFrame.setTitle("Login");
            loginFrame.pack();
            loginFrame.setVisible(true);
        }

    }

    public void mainGUI() {

    }

    public static void main(String[] args) {
        new GUI();
    }
}
