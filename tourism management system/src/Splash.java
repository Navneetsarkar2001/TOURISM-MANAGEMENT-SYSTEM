import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class SplashFrame extends JFrame implements Runnable
{
    Thread t1;
    SplashFrame()
    {
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1030, 750, Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel l1 = new JLabel(i3);
       add(l1);
       setUndecorated(true);
       t1 = new Thread(this);
       t1.start();
        
    }
    @Override
    public void run() {
        try{
            Thread.sleep(7000);
            this.setVisible(false);

            Login l = new Login();
            l.setVisible(true);

        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

public class Splash {

    public static void main(String[] args)
    {
        SplashFrame f = new SplashFrame();
        f.setVisible(true);

          int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f.setLocation(900 - ((i+x)/2), 500 - (i/2));
            f.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    
}

