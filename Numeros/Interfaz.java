import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 * Write a description of class Interfaz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interfaz extends JFrame implements ActionListener
{ 
   
    JLabel j1 = new JLabel();
    JTextField t1 = new JTextField();
    JButton b1 = new JButton();
    JLabel j2 = new JLabel();
    
    public Interfaz()
    {
        // initialise instance variables
       this.setTitle("Números");
       this.setSize(200,200);
       
       //this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon("images/fondoprincipal.png")));
       this.getContentPane().setLayout(new GridLayout(4,1));
       
       j1.setText("Numero");
       j1.setVerticalAlignment(SwingConstants.CENTER);
       j1.setHorizontalAlignment(SwingConstants.CENTER);
       
       
       t1.setHorizontalAlignment(SwingConstants.CENTER);
       
       b1.setText("Validar");
       
       b1.addActionListener(this); 
       
       this.add(j1);
       
       this.add(t1);
       this.add(b1);
       this.add(j2);
       
       this.setVisible(true);


    }
    
    public void actionPerformed(ActionEvent ev){
        Numero n = new Numero();
        n.setX(Integer.parseInt(t1.getText()));
        j2.setText("El número " + n.esPar() + ", " + n.esPrimo() + ", " + n.esHappy());
    }

    
}
