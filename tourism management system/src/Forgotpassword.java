import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Forgotpassword extends JFrame implements ActionListener
{
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,b2,b3 ;
    Forgotpassword()
    {
        setBounds(550,250,850,400);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p = new JPanel();
        p.setLayout(null);
        p.setBounds(30,30,500,330);
        add(p);

        JLabel l1 = new JLabel("Username");
        l1.setBounds(40,20,100,25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l1);

        tf1 = new JTextField();
        tf1.setBounds(200,20,150,25);
        p.add(tf1);

        b1 = new JButton("Search");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setBounds(380,20,100,25);
        p.add(b1);

         JLabel l2 = new JLabel("Name");
        l2.setBounds(40,60,100,25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l2);

        tf2 = new JTextField();
        tf2.setBounds(200,60,150,25);
        p.add(tf2);

        JLabel l3 = new JLabel("Security Question");
        l3.setBounds(40,105,170,25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l3);

        tf3 = new JTextField();
        tf3.setBounds(200,105,150,25);
        p.add(tf3);

        JLabel l4 = new JLabel("Answer");
        l4.setBounds(40,150,100,25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l4);

        b2 = new JButton("Retrive");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(380,150,100,25);
        p.add(b2);

        tf4 = new JTextField();
        tf4.setBounds(200,150,150,25);
        p.add(tf4);

        JLabel l5 = new JLabel("Password");
        l5.setBounds(40,195,170,25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p.add(l5);

        b3 = new JButton("Back");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setBounds(150,250,100,25);
        p.add(b3);


        tf5 = new JTextField();
        tf5.setBounds(200,195,150,25);
        p.add(tf5);

        tf1.setBorder(BorderFactory.createEmptyBorder());
        tf2.setBorder(BorderFactory.createEmptyBorder());
        tf3.setBorder(BorderFactory.createEmptyBorder());
        tf4.setBorder(BorderFactory.createEmptyBorder());
        tf5.setBorder(BorderFactory.createEmptyBorder());  
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l6 = new JLabel(i3);
        l6.setBounds(520,20,300,300);
        add(l6);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    
        Conn c = new Conn(); 
        if(ae.getSource()==b1)
        {
            try
            {
              String sql = "select * from account where username ='"+tf1.getText()+"'";
              ResultSet rs = c.s.executeQuery(sql);
             while(rs.next())
             {
                  tf2.setText(rs.getString("name"));
                  tf3.setText(rs.getString("question"));
             }
            }
            catch(Exception e)
            {

            }  
        }
        else if(ae.getSource()==b2)
        {
           try
            {
              String sql = "select * from account where answer ='"+tf4.getText()+"'AND username = '"+tf1.getText()+"'";
             ResultSet rs = c.s.executeQuery(sql);
             while(rs.next())
             {
                  tf5.setText(rs.getString("password"));
             }
            }
            catch(Exception e)
            {

            }  
        
        }
        else if(ae.getSource()==b3)
        {
            this.setVisible(false);
            new Login().setVisible(true);
        }
    
    }   
 
   public static void main(String[] args) {
       new Forgotpassword().setVisible(true);
   }


    
}
