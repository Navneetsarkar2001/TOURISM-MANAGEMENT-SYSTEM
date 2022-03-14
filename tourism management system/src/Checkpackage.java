import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Checkpackage extends JFrame
{

    JTabbedPane tab;
    Checkpackage()
    { 
        String[] package1 = new String[]{"GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 /~","package1.jpg"};
        
         String[] package2 = new String[]{"SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 /~","package2.jpg"};
         
         String[] package3 = new String[]{"BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding & other Games", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 /~","package3.jpg"};

        setBounds(600,250,900,600);
        tab = new JTabbedPane();

        JPanel p1 = createpackage(package1);
        tab.addTab("Package 1",null,p1);

        JPanel p2 = createpackage(package2);     
        tab.addTab("Package 2",null,p2);

        JPanel p3 = createpackage(package3);
        tab.addTab("Package 3",null,p3);   

        add(tab,BorderLayout.CENTER);
 
    }

    public JPanel createpackage(String []package1)
    {
         JPanel p1 = new JPanel();
         p1.setLayout(null);
         p1.setBackground(Color.WHITE);
         
         JLabel l1 = new JLabel(package1[0]);
         l1.setBounds(30,5,320,30);
         l1.setFont(new Font("Tahoma",Font.BOLD,30));
         p1.add(l1);

         JLabel l2 = new JLabel(package1[1]);
         l2.setBounds(30,60,300,30);
         l2.setForeground(Color.RED);
         l2.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l2);

         JLabel l3 = new JLabel(package1[2]);
         l3.setBounds(30,110,300,30);
         l3.setForeground(Color.BLUE);
         l3.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l3);
         
         JLabel l4 = new JLabel(package1[3]);
         l4.setBounds(30,160,300,30);
         l4.setForeground(Color.RED);
         l4.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l4);
         
         JLabel l5 = new JLabel(package1[4]);
         l5.setBounds(30,210,300,30);
         l5.setForeground(Color.BLUE);
         l5.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l5);

         JLabel l6 = new JLabel(package1[5]);
         l6.setBounds(30,260,300,30);
         l6.setForeground(Color.RED);
         l6.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l6);
         
         JLabel l7 = new JLabel(package1[6]);
         l7.setBounds(30,310,300,30);
         l7.setForeground(Color.BLUE);
         l7.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l7);

         JLabel l8 = new JLabel(package1[7]);
         l8.setBounds(30,360,300,30);
         l8.setForeground(Color.RED);
         l8.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l8);
         
         JLabel l9 = new JLabel(package1[8]);
         l9.setBounds(30,430,300,30);
         l9.setForeground(Color.BLUE);
         l9.setFont(new Font("Tahoma",Font.BOLD,30));
         p1.add(l9);
         
         JLabel l10 = new JLabel(package1[9]);
         l10.setBounds(380,470,300,30);
         l10.setForeground(Color.RED);
         l10.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l10);
         
         JLabel l11 = new JLabel(package1[10]);
         l11.setBounds(730,470,300,30);
         l11.setForeground(Color.BLUE);
         l11.setFont(new Font("Tahoma",Font.PLAIN,20));
         p1.add(l11);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+package1[11]));
         Image i2= i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel l12 = new JLabel(i3);
         l12.setBounds(350,20,500,300);
         p1.add(l12);
         return p1;

    }
    public static void main(String[] args) {
       
        new Checkpackage().setVisible(true);

    }
}
