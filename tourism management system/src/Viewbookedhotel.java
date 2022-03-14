import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Viewbookedhotel extends JFrame implements ActionListener
{

    JButton b1,b2,b3; 
    Viewbookedhotel(String username)
    {
        setBounds(600,240,1000,600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500, 400,Image.SCALE_DEFAULT); 
        ImageIcon i3= new ImageIcon(i2);
        JLabel l30 = new JLabel(i3);
        l30.setBounds(450,20,500,400);
        add(l30);

        JLabel heading = new JLabel("VIEW BOOKED HOTEL DETAILS");
        heading.setBounds(60,0,250,30);
        heading.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(heading);
        
         JLabel l1 = new JLabel("Username: ");
         l1.setBounds(30,70,100,30);
         add(l1);

         JLabel l11 = new JLabel();
         l11.setBounds(250,70,200,30);
         add(l11);

         JLabel l2 = new JLabel("Hotel Name: ");
         l2.setBounds(30,110,100,30);
         add(l2);

         JLabel l12 = new JLabel();
         l12.setBounds(250,110,200,30);
         add(l12);
          
         JLabel l3 = new JLabel("Total Persons: ");
         l3.setBounds(30,150,130,30);
         add(l3);

         JLabel l13 = new JLabel();
         l13.setBounds(250,150,200,30);
         add(l13);

         JLabel l4 = new JLabel("Total Days: ");
         l4.setBounds(30,190,100,30);
         add(l4);

         JLabel l14 = new JLabel();
         l14.setBounds(250,190,200,30);
         add(l14);
         
         JLabel l5 = new JLabel("AC Included? ");
         l5.setBounds(30,230,100,30);
         add(l5);

         JLabel l15 = new JLabel();
         l15.setBounds(250,230,200,30);
         add(l15);
          
         JLabel l6 = new JLabel("Food Included? ");
         l6.setBounds(30,270,110,30);
         add(l6);

         JLabel l16 = new JLabel();
         l16.setBounds(250,270,200,30);
         add(l16);
          
         JLabel l7 = new JLabel("ID:");
         l7.setBounds(30,310,100,30);
         add(l7);

         JLabel l17 = new JLabel();
         l17.setBounds(250,310,200,30);
         add(l17);

         JLabel l8 = new JLabel("Number:");
         l8.setBounds(30,350,100,30);
         add(l8);

         JLabel l18= new JLabel();
         l18.setBounds(250,350,200,30);
         add(l18);

         JLabel l9 = new JLabel("Phone:");
         l9.setBounds(30,390,100,30);
         add(l9);

         JLabel l19 = new JLabel();
         l19.setBounds(250,390,200,30);
         add(l19);

         JLabel l10 = new JLabel("Total Cost:");
         l10.setBounds(30,430,100,30);
         add(l10);

         JLabel l20 = new JLabel();
         l20.setBounds(250,430,200,30);
         add(l20);
        try
        {
              Conn c= new Conn();
              ResultSet rs= c.s.executeQuery("select * from bookHotel where username = '"+username+"'");
              while(rs.next())
              {

                 l11.setText(rs.getString(1)); 
                 l12.setText(rs.getString(2));
                 l13.setText(rs.getString(3));
                 l14.setText(rs.getString(4));
                 l15.setText(rs.getString(5));
                 l16.setText(rs.getString(6)); 
                 l17.setText(rs.getString(7));
                 l18.setText(rs.getString(8));
                 l19.setText(rs.getString(9));
                 l20.setText(rs.getString(10)); 
              }
        } 
        catch (Exception e)
        {
            
        }

         b1 = new JButton("Back");
         b1.setBackground(Color.BLACK);
         b1.setForeground(Color.WHITE);
         b1.setBounds(150,480,150,25); 
         add(b1);

         b1.addActionListener(this);

    }

    public static void main(String[] args) {
        new Viewbookedhotel("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        
    }
    
}
