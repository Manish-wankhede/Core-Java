import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DigitalClock extends JFrame {

    JLabel l1, l2;
    SimpleDateFormat d1, d2;

    DigitalClock(String s1) {
        super(s1);
    }

    DigitalClock() {

    }

    void setComponent() {
        l1 = new JLabel();
        l2 = new JLabel();

        l1.setFont(new Font("Vardana", Font.BOLD, 40));
        Color c1 = Color.RED;
        Color c2 = c1.brighter();
        l1.setForeground(c2);
        l1.setBackground(Color.black);
        l1.setOpaque(true);

        l2.setFont(new Font("Vendara", Font.BOLD, 40));
        l2.setForeground(c2);
        l2.setBackground(Color.black);
        l2.setOpaque(true);

        setLayout(null);
        add(l1);
        add(l2);

        l1.setBounds(50, 50, 300, 100);
        l2.setBounds(50, 300, 300, 100);

        d1 = new SimpleDateFormat("hh:mm:ss a");
        d2 = new SimpleDateFormat("dd:MM:yyyy");

        String time = d1.format(Calendar.getInstance().getTime());
        l1.setText(time);

        String day = d2.format(Calendar.getInstance().getTime());
        l2.setText(day);

        while (true) {
            time = d1.format(Calendar.getInstance().getTime());
            l1.setText(time);

            day = d2.format(Calendar.getInstance().getTime());
            l2.setText(day);

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        DigitalClock dc = new DigitalClock("Digital Clock");
        dc.setVisible(true);
        dc.setSize(500, 500);
        dc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dc.setComponent();
    }
}
