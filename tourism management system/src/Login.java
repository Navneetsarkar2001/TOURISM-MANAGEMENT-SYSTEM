import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JTextField tf1;
    JPasswordField tf2;
    Login()
    {
        setLayout(null); 
        getContentPane().setBackground(Color.WHITE);  
        setBounds(500,300,900,400);
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        
        Image i2 = i1.getImage().getScaledInstance(200,200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 = new JLabel(i3);
        l1.setBounds(100,120,200,200);
        p1.add(l1);
        add(p1);



        JPanel p2 = new JPanel();
        p2.setBounds(400,30,450,300);
        add(p2);
        p2.setLayout(null);
        
        JLabel l2 = new JLabel("Username");
        l2.setBounds(60,20,100,25);
        l2.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p2.add(l2);

        tf1 = new JTextField();
        tf1.setBounds(60,60,300,30);
        tf1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tf1);

        JLabel l3 = new JLabel("Password");
        l3.setBounds(60,110,100,25);
        l3.setFont(new Font("SAN_SERIF",Font.BOLD,14));
        p2.add(l3);

        tf2 = new JPasswordField();
        tf2.setBounds(60, 150, 300, 30);
        tf2.setEchoChar('*');
        tf2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tf2); 

        b1 = new JButton("Login");
        b1.setBounds(60,200,130,30);
        b1.setBackground(new Color(133,193,233));
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);

        b2 = new JButton("Signup");
        b2.setBounds(230,200,130,30);
        b2.setBackground(Color.WHITE);
        b2.setForeground(new Color(133,193,233));
        b2.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(b2);
     
        b3 = new JButton("Forgot-Password");
        b3.setBounds(140,250,150,30);
        b3.setBackground(Color.WHITE);
        b3.setForeground(new Color(133,193,233));
        b3.setBorder(new LineBorder(new Color(133,193,233)));
        p2.add(b3);

        JLabel l4 = new JLabel("Trouble in Login...");
        l4.setBounds(300,250,150,30);
        l4.setForeground(Color.RED);
        p2.add(l4); 
        
        setVisible(true);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);  
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == b1)
        {
           try
           {
                String username = tf1.getText();
                String password = tf2.getText();
                String sql = "select * from account where username ='"+username+"' AND password = '"+password+"'"; 

                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(sql);
                if(rs.next()) 
                {
                     this.setVisible(false);
                     new Loading(username).setVisible(true);
                } 
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                }
           } 
           catch(Exception e)
           {
                    
           }
           
        }
        else if(ae.getSource()==b2)
        {
           new Signup().setVisible(true);
           this.setVisible(false);
        }
        else if(ae.getSource()==b3)
        {
            this.setVisible(false);
            new Forgotpassword().setVisible(true);
              
        }
        
    }
    public static void main(String[] args) {
        new Login();

        
    }
    
}

