import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.concurrent.TransferQueue;


public class Paytm extends JFrame implements ActionListener
{
    JButton b1;
    Paytm()
    {
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try
        {
            j.setPage("https://paytm.com/credit-card-bill-payment");
        } 
        catch (Exception e) 
        {
            j.setContentType("text/html");
            j.setText("<html>Could not load,Error 404</html>");
        }

        JScrollPane js = new JScrollPane(j);
        getContentPane().add(js);

        b1 = new JButton("Back");
        b1.setBounds(610,20,80,40);
        j.add(b1);
        
        setBounds(670,240,800,600);
        b1.addActionListener(this); 
      
    }


    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        new Payment().setVisible(true);
    }

   
}
