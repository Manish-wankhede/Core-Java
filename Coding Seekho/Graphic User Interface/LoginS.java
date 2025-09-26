import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.*;

public class LoginS extends JFrame {

    JLabel l1, l2, l3, l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2, b3, b4;

    LoginS(String s1) {
        super(s1);
    }

    LoginS() {

    }

    void setComponents() {

        Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
        Font f1 = new Font("Times New Roman", Font.BOLD, 28);

        Font f3 = new Font("Callibri", Font.BOLD, 15);

        l1 = new JLabel("Welcome to Coding Siko");
        l1.setFont(f1);
        l1.setForeground(Color.RED);

        l2 = new JLabel("Username");
        l2.setFont(f3);

        l3 = new JLabel("Password");
        l3.setForeground(Color.MAGENTA);

        Font f2 = new Font("Callibri", Font.ITALIC, 18);
        l3.setFont(f2);

        l4 = new JLabel();

        t1 = new JTextField();
        t2 = new JPasswordField();

        b1 = new JButton("Login");
        b1.setCursor(c1);
        b1.setBackground(Color.blue);
        b1.setForeground(Color.white);

        b2 = new JButton("Clear");
        b2.setCursor(c1);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.YELLOW);

        b3 = new JButton("Add");
        b3.setCursor(c1);
        b3.setForeground(Color.white);
        b3.setBackground(Color.red);

        b4 = new JButton("AutoFill");
        b4.setForeground(Color.BLACK);
        b4.setBackground(Color.green);

        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);

        l1.setBounds(100, 50, 300, 30);
        l2.setBounds(100, 200, 100, 30);
        l3.setBounds(100, 350, 100, 30);
        l4.setBounds(100, 550, 300, 25);
        t1.setBounds(350, 200, 100, 25);
        t2.setBounds(350, 350, 100, 25);
        b1.setBounds(100, 450, 100, 25);
        b2.setBounds(250, 450, 100, 25);
        b3.setBounds(500, 550, 100, 30);
        b4.setBounds(400, 450, 100, 25);
        // b2.setBounds(250, 450, 100, 25);

        b1.addActionListener(new Log());
        b2.addActionListener(new Clear());
        b3.addActionListener(new Add());
        b4.addActionListener(new AutoFill());
        l2.addMouseListener(new MouseL());

    }

    public static void main(String[] args) {
        LoginS lg = new LoginS("Welcome to GUI");
        lg.setVisible(true);
        lg.setSize(700, 700);
        lg.setComponents();
        lg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class Log implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();

            if (s1.equals("Coding") && s2.equals("Sikho")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
                l4.setText("Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Please Field Correct Login & Password");
                l4.setText("Login Unsuccessful");
            }
        }
    }

    class Clear implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1.setText("");
            t2.setText("");
        }
    }

    class Add implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            try {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                int c = a + b;
                l4.setText("Addtion is: " + c);
            } catch (Exception e1) {
                l4.setText("Please Enter number only");
            }
        }
    }

    class AutoFill implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            t1.setText("Coding");
            t2.setText("Sikho");
        }
    }

    class MouseL implements MouseListener {

        public void mouseClicked(MouseEvent e) {
            l2.setText("Mouse Clicked");
        }

        public void mousePressed(MouseEvent e) {

        }

        public void mouseReleased(MouseEvent e) {

        }

        public void mouseEntered(MouseEvent e) {
            l2.setForeground(Color.red);
        }

        public void mouseExited(MouseEvent e) {
            l2.setForeground(Color.black);
        }

    }
}