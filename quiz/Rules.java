import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    JButton back, start;
    String name;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading = new JLabel("Welcome " + name + " to QUIZZY");
        heading.setBounds(50, 25, 700, 30);
        heading.setFont(new Font("Courier", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 400);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.BLACK);
        rules.setText(
                "<html>" + "<center> <h1>Rules</h1> </center>" +
                        "1. The quiz consists of multiple-choice questions.Each question will have four options, out of which only one is correct"
                        + "<br><br>" +
                        "2.Participants will earn points for each correct answer.No negative marking for incorrect answers."
                        + "<br><br>" +
                        "3. In case of any technical issues during the quiz, participants are requested to contact support immediately"
                        + "<br><br>"
                        +
                        "4. Participants found cheating or using unfair means will be disqualified." + "<br><br>" +
                        "5. Participant data will be used only for the purpose of the quiz and will not be shared with third parties."
                        + "<br><br>" +
                        "6. You may have lot of options in life but here all the questions are compulsory"
                        + "<br><br>" +
                        "7. Participants are encouraged to provide feedback about the quiz app."
                        + "<br><br>" +
                        "<html>");
        add(rules);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(59, 59, 59));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(128, 128, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);

        } else {
            setVisible(false);
            new log_in();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
