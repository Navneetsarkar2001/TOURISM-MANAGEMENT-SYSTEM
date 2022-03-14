import java.awt.*;

import javax.lang.model.element.QualifiedNameable;
import javax.swing.*;

import com.mysql.cj.Query;

import java.awt.event.*;
import java.security.AllPermission;
import java.sql.*;

public class Signup extends JFrame implements ActionListener
{
    JButton b1,b2;
    JTextField tf1,tf2,tf3,tf4;
    Choice c1;

    Signup()
    {
        setBounds(600,200,900,380);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null); 

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Signup2.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(400, 380, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(500,0,400,380);
        add(l6);


        JLabel l1 = new JLabel("Username");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(50,20,145,25);
        p1.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(200,20,180,25);
        tf1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tf1);

        JLabel l2 = new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(50,60,145,25);
        p1.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(200,60,180,25);
        tf2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tf2);

        JLabel l3 = new JLabel("Password");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(50,100,145,25);
        p1.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(200,100,180,25);
        tf3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tf3);
        
        JLabel l4 = new JLabel("Security Question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(50,140,145,25);
        p1.add(l4);

        c1 = new Choice();
        c1.add("Your Nickname");
        c1.add("Your Birth Place");
        c1.add("Your Birth Place");
        c1.add("Your Favourite Sports");
        c1.setBounds(200,140,180,25);
        p1.add(c1);

        JLabel l5 = new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(50,180,145,25);
        p1.add(l5);
 
        tf4 = new JTextField();
        tf4.setBounds(200,180,180,25);
        tf4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tf4);
        
         b1 = new JButton("Create");
         b1.setBounds(80,250,100,25);
         b1.setFont(new Font("Tahoma",Font.BOLD,14));
         b1.setBackground(Color.WHITE);
         b1.setForeground(new Color(123,193,233));
         p1.add(b1);

         b2 = new JButton("Back");
         b2.setBounds(250,250,100,25);
         b2.setFont(new Font("Tahoma",Font.BOLD,14));
         b2.setBackground(Color.WHITE);
         b2.setForeground(new Color(123,193,233));
         p1.add(b2);
         b1.addActionListener(this);
         b2.addActionListener(this);

    }  
    @Override
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource()==b1)
        {
           String username = tf1.getText();
           String name     = tf2.getText();
           String password = tf3.getText();
           String security = c1.getSelectedItem();
           String Answer   = tf4.getText();
           
           String query = "insert into account values('"+username+"','"+name+"','"+password+"','"+security+"','"+Answer+"')";
           
           try{
               Conn c = new Conn();
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null,"Costomer Details Added Successfully ");

           }
           catch(Exception e)
           {

           }

        }
        else if(ae.getSource()==b2)
        {
            new Login().setVisible(true);
            this.setVisible(false);
        }

        
    }   
    public static void main(String[] args) 
    {
     
        new Signup().setVisible(true);

    }
    
   
    
    
}
