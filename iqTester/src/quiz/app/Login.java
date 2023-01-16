package quiz.app;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {
    JButton rules,back;
    JTextField jfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon li = new ImageIcon(ClassLoader.getSystemResource("img/new1.png"));
        JLabel image = new JLabel(li);
        image.setBounds(0,-30,500,500);
        add(image);
         
        JLabel heading = new JLabel("BRILLIANT MINDS");
        heading.setBounds(630,120,300,40);
        heading.setFont(new Font("Bebas Neue",Font.BOLD,45));
        heading.setForeground(Color.BLACK);
        add(heading);
         
        JLabel name = new JLabel("ENTER YOUR NAME");
        name.setBounds(680,180,250,30);
        name.setFont(new Font("Oswald",Font.BOLD,16));
        name.setForeground(Color.GRAY);
        add(name);
         
        jfname = new JTextField();
        jfname.setBounds(640,220,230,30);
        jfname.setFont(new Font("Times new Roman",Font.ITALIC,20));
        add(jfname);
       
        rules = new JButton("Rules");
        rules.setBounds(640,300,100,20);
        rules.setBackground(new Color(30, 144, 255));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(770,300,100,20);
        back.setBackground(new Color(30, 144, 255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1000,480);
        setLocation(100,100);
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent ac){
          if(ac.getSource() == rules){
           String name = jfname.getText();
           setVisible(false);
           new Rules(name);
          }else if(ac.getSource() == back){
            setVisible(false);
          }
    }
    public static void main(String[] args) {
        new Login();
    }
}
