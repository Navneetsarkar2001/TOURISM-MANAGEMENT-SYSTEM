import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Checkhotels extends JFrame implements Runnable
{
    Thread t1;

    JLabel caption;
  
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
    JLabel [] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7,l8,l9,l10}; 

    ImageIcon i1,i2,i3,i4,i5,i6,i7,i8,i9,i10;
    ImageIcon [] image = new ImageIcon[] {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};

    Image j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
    Image[] Jimage= new Image[]{j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

    ImageIcon i11,i12,i13,i14,i15,i16,i17,i18,i19,i20;
    ImageIcon [] iimage = new ImageIcon[] {i11,i12,i13,i14,i15,i16,i17,i18,i19,i20};
 
    Checkhotels()
    {
      setBounds(650,240,900,700);

      caption = new JLabel();
      caption.setBounds(50,550,1000,70);
      caption.setForeground(Color.WHITE);
      caption.setFont(new Font("Tahoma",Font.PLAIN,30));
      add(caption);
      for(int i=0;i<9;i++)
      {  
        image[i]= new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+(i+1)+".jpg"));
        Jimage[i] = image[i].getImage().getScaledInstance(900,700 ,Image.SCALE_DEFAULT );
        iimage[i] = new ImageIcon(Jimage[i]);
        this.label[i]= new JLabel(iimage[i]);
        this.label[i].setBounds(0,0,900,700);
        add(this.label[i]);
      }

      t1 = new Thread(this);
      t1.start();  
        
    }
     public static void main(String[] args) {
     
        new Checkhotels().setVisible(true);
    }
    @Override
    public void run() {
        String [] text = new String[]{"JW Marriot Hotel","Mandarin Oriental Hotel","Radisson Hotel","Classio Hotel","The Bay Club Hotel","Breezze Bows Hotel","Quick Stop Hotel","Happy Morning Motel","Moss View Hotel"};
        
        try
        {
            for(int i=0;i<=9;i++)
            {
                this.label[i].setVisible(true);
                caption.setText(text[i]);
                this.label[i].add(caption);
                Thread.sleep(2800);
                this.label[i].setVisible(false);
            }
        }
        catch(Exception e)
        {

        } 
    }
    
}
