import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphicalInterface extends JFrame {

    public GraphicalInterface() {
        setTitle("ADDITION");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        setLayout(new FlowLayout());

        JLabel FirstNum = new JLabel("Enter the first number");
        add(FirstNum);
        JTextField num1 = new JTextField("", 10);
        add(num1);
        JLabel SecNum = new JLabel("Enter the second number");
        add(SecNum);
        JTextField num2 = new JTextField("", 10);
        add(num2);
        JButton Addition = new JButton("ADD");
        add(Addition);
        JTextField sum = new JTextField(10);
        add(sum);

        Addition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int a = Integer.parseInt(num1.getText());
                int b = Integer.parseInt(num2.getText());

                int total = a + b;

                sum.setText("The sum is " + total);

            }
        });

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GraphicalInterface();
            }
        });
    }
}