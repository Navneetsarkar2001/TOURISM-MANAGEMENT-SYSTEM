import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class Viewcustomer extends JFrame implements ActionListener
{
    JButton b2;

    Viewcustomer(String username)
    {
        
       setBounds(600,250,900,680);
       getContentPane().setBackground(Color.WHITE);  
       setLayout(null);

       JLabel l1 = new JLabel("Username");
       l1.setBounds(30,50,150,25);
       l1.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l1);

       JLabel l11 = new JLabel();
       l11.setBounds(200,50,200,25);
       l11.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l11);
       

       JLabel l2 = new JLabel("ID");
       l2.setBounds(30,90,150,25);
       add(l2);  
       
       JLabel l12 = new JLabel();
       l12.setBounds(200,90,200,25);
       l12.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l12);

       JLabel l3 = new JLabel("Number");
       l3.setBounds(30,130,150,25);
       add(l3);

       JLabel l13 = new JLabel();
       l13.setBounds(200,130,200,25);
       l13.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l13);
  
       
       JLabel l4 = new JLabel("Name");
       l4.setBounds(30,170,150,25);
       add(l4);

       JLabel l14 = new JLabel();
       l14.setBounds(200,170,200,25);
       l14.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l14);


       JLabel l5 = new JLabel("Gender");
       l5.setBounds(30,210,150,25);
       add(l5);
       
       JLabel l15 = new JLabel();
       l15.setBounds(200,210,200,25);
       l15.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l15);

    
       JLabel l6 = new JLabel("Country");
       l6.setBounds(30,250,150,25);
       add(l6);

       JLabel l16 = new JLabel();
       l16.setBounds(200,250,200,25);
       l16.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l16);


       JLabel l7 = new JLabel("Address");
       l7.setBounds(30,290,150,25);
       add(l7);

       JLabel l17 = new JLabel();
       l17.setBounds(200,290,300,25);
       l17.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l17);
 
       
       JLabel l8 = new JLabel("Phone no");
       l8.setBounds(30,330,150,25);
       add(l8);

       JLabel l18 = new JLabel();
       l18.setBounds(200,330,200,25);
       l18.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l18);
  

       JLabel l9 = new JLabel("Email Id");
       l9.setBounds(30,370,150,25);
       add(l9);

       JLabel l19 = new JLabel();
       l19.setBounds(200,370,350,25);
       l19.setFont(new Font("Tahoma",Font.PLAIN,20));
       add(l19);


        b2 = new JButton("Back");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(220,430,100,25);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(0,450,900,200);
        add(l10);
        
        b2.addActionListener(this);

        try
        {
           Conn c = new Conn();
           
           ResultSet rs =  c.s.executeQuery("select * from customer where username='"+username+"'");
           while(rs.next())
           {
               l11.setText(rs.getString("username"));
               l12.setText(rs.getString("id_type"));
               l13.setText(rs.getString("number"));
               l14.setText(rs.getString("name"));
               l15.setText(rs.getString("gender"));
               l16.setText(rs.getString("country"));
               l17.setText(rs.getString("address"));
               l18.setText(rs.getString("phone")); 
               l19.setText(rs.getString("email"));
           }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println(username);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        
        if(ae.getSource()==b2)
        {
           this.setVisible(false);
           
        }   

    }
    

    public static void main(String[] args) 
    {
        new Viewcustomer("").setVisible(true);
    }

}


