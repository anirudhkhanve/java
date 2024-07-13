import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);

        JLabel heading = new JLabel(" Thankyou " + name + " for playing qUIZZy");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);

        JLabel new_score = new JLabel(" Your Score is " + score);
        new_score.setBounds(350, 200, 300, 30);
        new_score.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(new_score);

        JButton Play_again = new JButton("Play again");
        Play_again.setBounds(380, 270, 120, 30);
        Play_again.setBackground(new Color(59, 59, 59));
        Play_again.setForeground(Color.WHITE);
        Play_again.addActionListener(this);
        add(Play_again);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new log_in();

    }

    public static void main(String[] args) {
        new Score("User", 0);

    }
}
