package quiz.app;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[20][5];
    String answers[][] = new String[20][2];
    String useranswers[][] = new String[20][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, last;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    public static int IQ = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        setBounds(150, 50, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("img/new3.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1000, 300);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(60, 330, 200, 30);
        qno.setForeground(Color.black);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(100, 330, 800, 30);
        question.setForeground(Color.BLACK);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
questions[0][0] = "Which number should come next in this sequence? \n 4 8 12 16 20 _";
questions[0][1] = "24";
questions[0][2] = "28";
questions[0][3] = "32";
questions[0][4] = "36";

questions[1][0] = "ABABCABCDABCD?";
questions[1][1] = "E";
questions[1][2] = "B";
questions[1][3] = "C";
questions[1][4] = "A";

questions[2][0] = "ZZYZYXZYXWZY?";
questions[2][1] = "V";
questions[2][2] = "Z";
questions[2][3] = "X";
questions[2][4] = "W";

questions[3][0] = "ABDGKP?";
questions[3][1] = "S";
questions[3][2] = "T";
questions[3][3] = "Q";
questions[3][4] = "V";

questions[4][0] = "AY, BX, CW, DV, ?";
questions[4][1] = "EU";
questions[4][2] = "GH";
questions[4][3] = "EF";
questions[4][4] = "EV";

questions[5][0] = "A2Y, B4W, C6U ?";
questions[5][1] = "E8S";
questions[5][2] = "D8S";
questions[5][3] = "F8P";
questions[5][4] = "P8V";

questions[6][0] = "AB, CF, EJ, ?, IR";
questions[6][1] = "HO";
questions[6][2] = "FM";
questions[6][3] = "FL";
questions[6][4] = "GH";

questions[7][0] = "BY, DW, ? , HS, JQ";
questions[7][1] = "FT";
questions[7][2] = "CH";
questions[7][3] = "MQ";
questions[7][4] = "EB";

questions[8][0] = "ZZYZYXZYXWZYXWVZYXWVUZYXWVU?";
questions[8][1] = "T";
questions[8][2] = "M";
questions[8][3] = "X";
questions[8][4] = "Z";

questions[9][0] = "ZYXWVUTZYXWVUZYXWVZYXW?";
questions[9][1] = "Z";
questions[9][2] = "Y";
questions[9][3] = "X";
questions[9][4] = "Q";

questions[10][0] = "ZZYWZYWSZYWSKZYWS?";
questions[10][1] = "J";
questions[10][2] = "K";
questions[10][3] = "A";
questions[10][4] = "S";

questions[11][0] = "A,B,D,G,K,?";
questions[11][1] = "P";
questions[11][2] = "E";
questions[11][3] = "F";
questions[11][4] = "H";

questions[12][0] = "A,C,F,H,K,M,P,R,U,W,?";
questions[12][1] = "Y";
questions[12][2] = "Z";
questions[12][3] = "W";
questions[12][4] = "X";

questions[13][0] = "A,D,F,I,K,N,P,S,U,?";
questions[13][1] = "X";
questions[13][2] = "Y";
questions[13][3] = "Z";
questions[13][4] = "W";

questions[14][0] = "ABCDMNOPABCDEMNOPQABCDEFMNOPQ?";
questions[14][1] = "R";
questions[14][2] = "X";
questions[14][3] = "S";
questions[14][4] = "G";

questions[15][0] = "ZX YV WS ? PJ";
questions[15][1] = "OG";
questions[15][2] = "GJ";
questions[15][3] = "FD";
questions[15][4] = "JH";

questions[16][0] = "AC FH KM PR ?";
questions[16][1] = "WX";
questions[16][2] = "YX";
questions[16][3] = "VF";
questions[16][4] = "GK";

questions[17][0] = "CBD, GFH, KJL, ?, SRT";
questions[17][1] = "OPQ";
questions[17][2] = "JKL";
questions[17][3] = "MNB";
questions[17][4] = "DFG";

questions[18][0] = "XWA, VTC, SPF, OKJ, ?";
questions[18][1] = "NIM";
questions[18][2] = "ASD";
questions[18][3] = "GHJ";
questions[18][4] = "EFV";

questions[19][0] = "BEF, DGH, FIJ, HKL ?";
questions[19][1] = "MNO";
questions[19][2] = "WEX";
questions[19][3] = "RFV";
questions[19][4] = "YUV";



answers[0][1] = "24";
answers[1][1] = "E";
answers[2][1] = "V";
answers[3][1] = "S";
answers[4][1] = "EU";
answers[5][1] = "E8S";
answers[6][1] = "HO";
answers[7][1] = "FT";
answers[8][1] = "T";
answers[9][1] = "Z";
answers[10][1] = "J";
answers[11][1] = "P";
answers[12][1] = "Y";
answers[13][1] = "X";
answers[14][1] = "R";
answers[15][1] = "OG";
answers[16][1] = "WX";
answers[17][1] = "OPQ";
answers[18][1] = "NIM";
answers[19][1] = "MNO";




        
        opt1 = new JRadioButton();
        opt1.setBounds(90, 380, 600, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setForeground(Color.BLACK);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(90, 410, 600, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setForeground(Color.BLACK);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(90, 440, 600, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setForeground(Color.BLACK);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(90, 470, 600, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setForeground(Color.BLACK);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("NEXT");
        next.setBounds(750, 380, 200, 30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        last = new JButton("LAST");
        last.setBounds(750, 420, 200, 30);
        last.setFont(new Font("Tahoma", Font.PLAIN, 22));
        last.setBackground(new Color(30, 144, 255));
        last.setForeground(Color.WHITE);
        last.addActionListener(this);
        add(last);
        
        submit = new JButton("SUBMIT");
        submit.setBounds(750, 460, 200, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 18) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == last) {
            // if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
            //     opt2.setEnabled(false);
            //     opt3.setEnabled(false);
            // } else {
            //     opt1.setEnabled(false);
            //     opt4.setEnabled(false);
            // }
            // last.setEnabled(false);
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 18) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count--;
            start(count);

        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            IQ = score * 3;
            setVisible(false);
            new Score(name, score,IQ);

            try{
                Class.forName("com.mysql.jdbc.Driver");
       
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo1","root", "");
       
                String sql = "insert into std values(?,?,?)";
       
                PreparedStatement pt = conn.prepareStatement(sql );
       
                pt.setString(1,name);
                pt.setInt(2,score);
                pt.setInt(3,IQ);
                
                pt.executeUpdate();
                
                //JOptionPane.showMessageDialog(this,"data stored successfully");
                conn.close();
            } 
            catch(Exception e){ 
                //JOptionPane.showMessageDialog(this,e);
            
            }
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.WHITE);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 680, 300);
        } else {
            g.drawString("Times up!!", 1100, 400);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 18) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 19) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }

                    
                }
                setVisible(false);
                new Score(name, score,IQ);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}
