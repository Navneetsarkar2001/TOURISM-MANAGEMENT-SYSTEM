import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable
{
    String username;
    JProgressBar p;
    Thread t;
    @Override
    public void run() {
        try
        {
         for(int i=0;i<101;i++)
         {
             int m = p.getMaximum();
             int n = p.getValue();
             if(n<m)
             {
                 p.setValue(p.getValue()+1);
             }
             else
             {
                 i = 100;
                 setVisible(false);
                 new Dashboard(username).setVisible(true);
             }
            Thread.sleep(50); 
          }
        } 
        catch(Exception e)
        {

           
        }
    }  
    Loading(String user)
    {
       username = user; 
       setBounds(700,250,650,400);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       t = new Thread(this);

       JLabel l1 = new JLabel("Travel and Tourism Application");
       l1.setBounds(60,40,600,40);
       l1.setFont(new Font("Raleway",Font.BOLD,30));
       l1.setForeground(Color.BLUE);
       add(l1);

       p = new JProgressBar();
       p.setStringPainted(true);
       p.setBounds(150,130,300,25);
       add(p);

       JLabel l2 = new JLabel("Please Wait...");
       l2.setBounds(240,160,125,25);
       l2.setFont(new Font("Raleway",Font.BOLD,16));
       l2.setForeground(Color.RED);
       add(l2);

       JLabel l3 = new JLabel(" Welcome "+username);
       l3.setBounds(50,310,155,25);
       l3.setFont(new Font("Raleway",Font.BOLD,16));
       l3.setForeground(Color.RED);
       add(l3);
       t.start();
    }

    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }

    

        
        
    
    
}
