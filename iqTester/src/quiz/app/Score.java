package quiz.app;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

        Score(String name, int score,int IQ) {

       
  
        setBounds(150, 80, 1000, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/2.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing  Brilliant Minds");
        heading.setBounds(70, 30, 900, 50);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
        add(heading);
        
        JLabel lblscore = new JLabel("YOUR SCORE IS : " + score);
        lblscore.setBounds(400, 80, 300, 30);
        lblscore.setFont(new Font("Bebas Neue", Font.BOLD, 25));
        add(lblscore);

        int setIQ = IQ;

        JLabel lblIQ = new JLabel("YOUR IQ IS : " + setIQ);
        lblIQ.setBounds(400, 120, 300, 30);
        lblIQ.setFont(new Font("Bebas Neue", Font.BOLD, 25));
        add(lblIQ);

        JLabel lblsk = new JLabel("CHECK YOUR SKILLS HERE :");
        lblsk.setBounds(400, 160, 300, 30);
        lblsk.setFont(new Font("Bebas Neue", Font.BOLD, 25));
        add(lblsk);

              if(IQ <= 40){
                JTextArea textArea = new JTextArea();
                textArea.setText("-->Difficulty with basic daily tasks, such as dressing and grooming\n-->Constant assistance needed with activities of daily living\n-->Difficulty communicating and understanding language\n-->Limited social skills and difficulty forming relationships\n-->Difficulty learning new information or skills\n-->Requirement for specialized education and support\n-->Severe intellectual disability\n");
                textArea.setBounds(400, 220, 600, 170);
                textArea.setFont(new Font("Oswald", Font.BOLD, 18));
                add(textArea);
              }else if(IQ <= 80 && IQ >= 40){
                JTextArea textArea = new JTextArea();
                textArea.setText("-->Below average intelligence\n-->Difficulty with complex tasks and abstract concepts\n-->Struggles in school and at work\n-->Difficulty understanding instructions and following through on tasks\n-->Limited vocabulary and difficulty expressing themselves effectively\n-->Difficulty understanding social cues and making friends\n-->Difficulty planning ahead\n");
                textArea.setBounds(400, 220, 600, 170);
                textArea.setFont(new Font("Oswald", Font.BOLD, 18));
                add(textArea);
              }else if(IQ <= 120 && IQ >= 80){
                JTextArea textArea = new JTextArea();
                textArea.setText("-->Above average intelligence\n-->Strong problem-solving skills\n-->Good memory and ability to learn quickly\n-->Excel academically and have a good understanding of complex concepts\n-->Ability to understand and process information quickly\n-->Good verbal and written communication skills\n-->Good ability to reason and think abstractly\n-->Good sense of humor and ability to see things from different perspective\n");
                textArea.setBounds(400, 220, 600, 170);
                textArea.setFont(new Font("Oswald", Font.BOLD, 18));
                add(textArea);
              }else if(IQ <= 160 && IQ >= 120){
                JTextArea textArea = new JTextArea();
                textArea.setText("-->Exceptional problem-solving abilities\n-->Strong abstract reasoning skills\n-->Excellent memory and recall\n-->High level of creativity\n-->Advanced verbal and mathematical skills\n-->Ability to think and learn quickly\n-->Strong attention to detail\n");
                textArea.setBounds(400, 220, 600, 170);
                textArea.setFont(new Font("Oswald", Font.BOLD, 18));
                add(textArea);
              }else{
                JTextArea textArea = new JTextArea();
                textArea.setText("-->Exceptional ability to think and reason abstractly\n-->Strong ability to identify patterns and recognize relationships\n-->High level of originality and creativity\n-->Exceptional memory and recall\n-->Advanced understanding of complex concepts\n-->Exceptional ability to learn quickly and easily\n-->Strong ability to focus and concentrate for long periods of time\n");
                textArea.setBounds(400, 220, 600, 170);
                textArea.setFont(new Font("Oswald", Font.BOLD, 18));
                add(textArea);
              }
        JButton submit = new JButton("Play Again");
        submit.setBounds(400, 420, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        
     }

        
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0,0);
        
        
        
    }
}


