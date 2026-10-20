import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingDemo {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Example");

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");

        JLabel result = new JLabel("");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                result.setText("Hello, " + name + "!");
            }
        });

        frame.setLayout(new FlowLayout());

        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setSize(350, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
