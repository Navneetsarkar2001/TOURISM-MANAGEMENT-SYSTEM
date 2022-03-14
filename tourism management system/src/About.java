import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class About extends JFrame implements ActionListener
{
    JButton b1 ;
    String s;
    About()
    {
        setBounds(800,240,500,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);  

        JLabel l1 = new JLabel("Tourism Management System"); 
        l1.setBounds(50,10,400,80);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma",Font.PLAIN,20));
        s = "About this project \n "+
         "\n"+
        "The objective of the Travel and Tourism Management System project is to develop a system that automates the processes and activities of a travel and tourism agency. The purpose is to design a system using which one can perform all operations related to traveling and sight-seeing. The system allows one to easily access the relevant information and make necessary travel arrangements. Users can decide about places they want to visit and make bookings online for travel and accommodation.";
        TextArea t1 = new TextArea(s,10,40,Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,450,300);
        add(t1);
        add(l1);
        b1 = new JButton("Back");
        b1.setBounds(235,420,100,25);
        add(b1);
        b1.addActionListener(this);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       this.setVisible(false);
        
    }
}
