import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 420);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        // TextField for display
        JTextField tf = new JTextField();
        tf.setBounds(20, 20, 240, 40);
        tf.setFont(new Font("Arial", Font.BOLD, 18));
        tf.setHorizontalAlignment(JTextField.RIGHT);
        frame.add(tf);

        // Variables to store first number and operator
        final double[] num1 = new double[1];
        final char[] op = new char[1];

        // Buttons (20 buttons: 0-9, +, -, *, /, =, C, ., ←, x²)
        JButton b1 = new JButton("1"); b1.setBounds(20, 80, 50, 40);
        JButton b2 = new JButton("2"); b2.setBounds(80, 80, 50, 40);
        JButton b3 = new JButton("3"); b3.setBounds(140, 80, 50, 40);
        JButton add = new JButton("+"); add.setBounds(200, 80, 50, 40);

        JButton b4 = new JButton("4"); b4.setBounds(20, 130, 50, 40);
        JButton b5 = new JButton("5"); b5.setBounds(80, 130, 50, 40);
        JButton b6 = new JButton("6"); b6.setBounds(140, 130, 50, 40);
        JButton sub = new JButton("-"); sub.setBounds(200, 130, 50, 40);

        JButton b7 = new JButton("7"); b7.setBounds(20, 180, 50, 40);
        JButton b8 = new JButton("8"); b8.setBounds(80, 180, 50, 40);
        JButton b9 = new JButton("9"); b9.setBounds(140, 180, 50, 40);
        JButton mul = new JButton("*"); mul.setBounds(200, 180, 50, 40);

        JButton b0 = new JButton("0"); b0.setBounds(20, 230, 50, 40);
        JButton eq = new JButton("="); eq.setBounds(80, 230, 50, 40);
        JButton clr = new JButton("C"); clr.setBounds(140, 230, 50, 40);
        JButton div = new JButton("/"); div.setBounds(200, 230, 50, 40);

        JButton dot = new JButton("."); dot.setBounds(80, 280, 50, 40);
        JButton back = new JButton("←"); back.setBounds(140, 280, 50, 40);
        JButton square = new JButton("x²"); square.setBounds(20, 280, 50, 40);

        // Add buttons to frame
        frame.add(b1); frame.add(b2); frame.add(b3); frame.add(add);
        frame.add(b4); frame.add(b5); frame.add(b6); frame.add(sub);
        frame.add(b7); frame.add(b8); frame.add(b9); frame.add(mul);
        frame.add(b0); frame.add(eq); frame.add(clr); frame.add(div);
        frame.add(dot); frame.add(back); frame.add(square);

        // Number buttons (common listener)
        ActionListener numListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();
                tf.setText(tf.getText() + btn.getText());
            }
        };

        b1.addActionListener(numListener);
        b2.addActionListener(numListener);
        b3.addActionListener(numListener);
        b4.addActionListener(numListener);
        b5.addActionListener(numListener);
        b6.addActionListener(numListener);
        b7.addActionListener(numListener);
        b8.addActionListener(numListener);
        b9.addActionListener(numListener);
        b0.addActionListener(numListener);

        // Operators 
        add.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;
            num1[0] = Double.parseDouble(tf.getText());
            op[0] = '+';
            tf.setText("");
        });

        sub.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;
            num1[0] = Double.parseDouble(tf.getText());
            op[0] = '-';
            tf.setText("");
        });

        mul.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;
            num1[0] = Double.parseDouble(tf.getText());
            op[0] = '*';
            tf.setText("");
        });

        div.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;
            num1[0] = Double.parseDouble(tf.getText());
            op[0] = '/';
            tf.setText("");
        });

        // Equal button     
        eq.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;

            double num2 = Double.parseDouble(tf.getText());
            double result = 0;

            switch (op[0]) {
                case '+': result = num1[0] + num2; break;
                case '-': result = num1[0] - num2; break;
                case '*': result = num1[0] * num2; break;
                case '/':
                    if (num2 == 0) {
                        tf.setText("Error");
                        return;
                    }
                    result = num1[0] / num2;
                    break;
            }

            tf.setText(String.valueOf(result));
            num1[0] = result; // continuous calculation 
        });

        // Clear 
        clr.addActionListener(e -> {
            tf.setText("");
            num1[0] = 0;
            op[0] = '\0';
        });

        // Decimal
        dot.addActionListener(e -> {
            if (!tf.getText().contains(".")) {
                tf.setText(tf.getText() + ".");
            }
        });

        // Backspace 
        back.addActionListener(e -> {
            String text = tf.getText();
            if (!text.isEmpty()) {
                tf.setText(text.substring(0, text.length() - 1));
            }
        });

        // Square
        square.addActionListener(e -> {
            if (tf.getText().isEmpty()) return;
            double num = Double.parseDouble(tf.getText());
            tf.setText(String.valueOf(num * num));
        });

        frame.setVisible(true);
    }
}