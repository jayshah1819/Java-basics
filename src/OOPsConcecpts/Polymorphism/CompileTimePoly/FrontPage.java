package OOPsConcecpts.Polymorphism.CompileTimePoly;

import javax.swing.*;

public class FrontPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("University Portal");
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel welcomeLabel = new JLabel("Welcome to University of Dayton Portal");
        welcomeLabel.setBounds(50, 20, 300, 30);
        frame.add(welcomeLabel);

        JLabel nameLabel = new JLabel("Enter your name:");
        nameLabel.setBounds(50, 60, 200, 20);
        frame.add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(50, 80, 200, 30);
        frame.add(nameField);

        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(50, 130, 100, 30);
        frame.add(submitButton);

        submitButton.addActionListener(e -> {
            String userName = nameField.getText();
            Intro2 intro = new Intro2(12345, "test123");
            intro.UserName = userName;

            JOptionPane.showMessageDialog(frame, "User created: " + intro.UserName);
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
