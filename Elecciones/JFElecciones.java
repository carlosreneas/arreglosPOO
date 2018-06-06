
/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class JFElecciones extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JLabel label1;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JTextField textfield1;
    private JTextField textfield2;
    private JTextField textfield3;
    private JTextField textfield4;
    
    Elecciones e = new Elecciones();

    //Constructor 
    public JFElecciones() {

        this.setTitle("Elecciones 2017 Parcial");
        this.setSize(598,720);
        
        this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon("images/fondoprincipal.png")));



        button1 = new JButton();
        button1.setBounds(310,40,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Registrar");
        button1.setVisible(true);
        
        //button1.addActionListener(this);
        
        
        button1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent ev){
                   if (e.getC1() == null){
                        Candidato c = new Candidato();
                        c.setNombre(textfield1.getText());
                        label5.setText(textfield1.getText());
                        e.setC1(c);
                    }else if (e.getC2() == null){
                        Candidato c = new Candidato();
                        c.setNombre(textfield1.getText());
                        e.setC2(c);
                    }else if (e.getC3() == null){
                        Candidato c = new Candidato();
                        c.setNombre(textfield1.getText());
                        e.setC3(c);
                    }else{
                        System.out.println("Llegaste tarde a la elección");
                    }
               }
           
        });

        button2 = new JButton();
        button2.setBounds(310,90,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Limpiar");
        button2.setVisible(true);
        button2.addActionListener(this);

        button3 = new JButton();
        button3.setBounds(280,19,150,35);
        button3.setBackground(new Color(214,217,223));
        button3.setForeground(new Color(0,0,0));
        button3.setEnabled(true);
        button3.setFont(new Font("sansserif",0,12));
        button3.setText("Calcular Total Votos");
        button3.setVisible(true);

        button4 = new JButton();
        button4.setBounds(280,61,150,35);
        button4.setBackground(new Color(214,217,223));
        button4.setForeground(new Color(0,0,0));
        button4.setEnabled(true);
        button4.setFont(new Font("sansserif",0,12));
        button4.setText("Limpiar");
        button4.setVisible(true);

        label1 = new JLabel();
        label1.setBounds(34,20,90,35);
        label1.setBackground(new Color(214,217,223));
        label1.setForeground(new Color(0,0,0));
        label1.setEnabled(true);
        label1.setFont(new Font("sansserif",0,12));
        label1.setText("Nombre");
        label1.setVisible(true);

        label11 = new JLabel();
        label11.setBounds(11,5,150,45);
        label11.setBackground(new Color(214,217,223));
        label11.setForeground(new Color(0,0,0));
        label11.setEnabled(true);
        label11.setFont(new Font("sansserif",0,12));
        label11.setText("Total Votos Candidato 1:");
        label11.setVisible(true);

        label12 = new JLabel();
        label12.setBounds(11,36,150,35);
        label12.setBackground(new Color(214,217,223));
        label12.setForeground(new Color(0,0,0));
        label12.setEnabled(true);
        label12.setFont(new Font("sansserif",0,12));
        label12.setText("Total Votos Candidato 2:");
        label12.setVisible(true);

        label13 = new JLabel();
        label13.setBounds(11,62,150,35);
        label13.setBackground(new Color(214,217,223));
        label13.setForeground(new Color(0,0,0));
        label13.setEnabled(true);
        label13.setFont(new Font("sansserif",0,12));
        label13.setText("Total Votos Candidato 3:");
        label13.setVisible(true);

        label14 = new JLabel();
        label14.setBounds(11,89,150,35);
        label14.setBackground(new Color(214,217,223));
        label14.setForeground(new Color(0,0,0));
        label14.setEnabled(true);
        label14.setFont(new Font("sansserif",0,12));
        label14.setText("Total Votos Blanco:");
        label14.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(34,55,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("sansserif",0,12));
        label2.setText("Num Tarjeton");
        label2.setVisible(true);

        label3 = new JLabel();
        label3.setBounds(34,90,90,35);
        label3.setBackground(new Color(214,217,223));
        label3.setForeground(new Color(0,0,0));
        label3.setEnabled(true);
        label3.setFont(new Font("sansserif",0,12));
        label3.setText("Grado");
        label3.setVisible(true);

        label4 = new JLabel();
        label4.setBounds(34,125,90,35);
        label4.setBackground(new Color(214,217,223));
        label4.setForeground(new Color(0,0,0));
        label4.setEnabled(true);
        label4.setFont(new Font("sansserif",0,12));
        label4.setText("Jornada");
        label4.setVisible(true);
        
        label6 = new JLabel();
        label6.setBounds(10,5,104,126);
        label6.setBackground(new Color(214,217,223));
        label6.setForeground(new Color(0,0,0));
        label6.setEnabled(true);
        label6.setFont(new Font("sansserif",0,12));
        label6.setIcon(new ImageIcon(this.getClass().getResource("/images/c1.jpg")));
        label6.setText("Candidato1");
        label6.setVisible(true);
        label6.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent ev){
                       e.getC1().setVotos(e.getC1().getVotos() + 1);
               }
           
        });
        
        label5 = new JLabel();
        label5.setBounds(10,133,104,20);
        label5.setBackground(new Color(214,217,223));
        label5.setForeground(new Color(0,0,0));
        label5.setEnabled(true);
        label5.setFont(new Font("sansserif",0,12));
        label5.setText("Nombre Candidato1");
        label5.setVisible(true);
        
        label7 = new JLabel();
        label7.setBounds(119,5,104,126);
        label7.setBackground(new Color(214,217,223));
        label7.setForeground(new Color(0,0,0));
        label7.setEnabled(true);
        label7.setFont(new Font("sansserif",0,12));
        label7.setIcon(new ImageIcon(this.getClass().getResource("/images/c2.jpg")));
        label7.setText("Candidato2");
        label7.setVisible(true);
        label7.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent ev){
                       e.getC2().setVotos(e.getC2().getVotos() + 1);
               }
           
        });

        label8 = new JLabel();
        label8.setBounds(228,5,104,126);
        label8.setBackground(new Color(214,217,223));
        label8.setForeground(new Color(0,0,0));
        label8.setEnabled(true);
        label8.setFont(new Font("sansserif",0,12));
        label8.setIcon(new ImageIcon(this.getClass().getResource("/images/c3.jpg")));
        label8.setText("Candidato3");
        label8.setVisible(true);
        label8.addMouseListener(new MouseAdapter(){
           public void mouseClicked(MouseEvent ev){
                       e.getC3().setVotos(e.getC3().getVotos() + 1);
               }
           
        });

        label9 = new JLabel();
        label9.setBounds(337,5,104,126);
        label9.setBackground(new Color(214,217,223));
        label9.setForeground(new Color(0,0,0));
        label9.setEnabled(true);
        label9.setFont(new Font("sansserif",0,12));
        label9.setIcon(new ImageIcon(this.getClass().getResource("/images/cb.jpg")));
        label9.setText("VotoBlanco");
        label9.setVisible(true);

        panel1 = new JPanel(null);
        panel1.setBorder(BorderFactory.createEtchedBorder(1));
        panel1.setBounds(60,102,456,200);
        panel1.setBackground(new Color(214,217,223));
        panel1.setForeground(new Color(0,0,0));
        panel1.setEnabled(true);
        panel1.setFont(new Font("sansserif",0,12));
        panel1.setVisible(true);

        panel2 = new JPanel(null);
        panel2.setBorder(BorderFactory.createEtchedBorder(1));
        panel2.setBounds(60,320,456,180);
        panel2.setBackground(new Color(214,217,223));
        panel2.setForeground(new Color(0,0,0));
        panel2.setEnabled(true);
        panel2.setFont(new Font("sansserif",0,12));
        panel2.setVisible(true);

        panel3 = new JPanel(null);
        panel3.setBorder(BorderFactory.createEtchedBorder(1));
        panel3.setBounds(60,527,456,140);
        panel3.setBackground(new Color(214,217,223));
        panel3.setForeground(new Color(0,0,0));
        panel3.setEnabled(true);
        panel3.setFont(new Font("sansserif",0,12));
        panel3.setVisible(true);

        textfield1 = new JTextField();
        textfield1.setBounds(146,20,120,30);
        textfield1.setBackground(new Color(255,255,255));
        textfield1.setForeground(new Color(0,0,0));
        textfield1.setEnabled(true);
        textfield1.setFont(new Font("sansserif",0,12));
        textfield1.setText("");
        textfield1.setVisible(true);

        textfield2 = new JTextField();
        textfield2.setBounds(146,55,120,30);
        textfield2.setBackground(new Color(255,255,255));
        textfield2.setForeground(new Color(0,0,0));
        textfield2.setEnabled(true);
        textfield2.setFont(new Font("sansserif",0,12));
        textfield2.setText("");
        textfield2.setVisible(true);

        textfield3 = new JTextField();
        textfield3.setBounds(146,90,120,30);
        textfield3.setBackground(new Color(255,255,255));
        textfield3.setForeground(new Color(0,0,0));
        textfield3.setEnabled(true);
        textfield3.setFont(new Font("sansserif",0,12));
        textfield3.setText("");
        textfield3.setVisible(true);

        textfield4 = new JTextField();
        textfield4.setBounds(146,125,120,30);
        textfield4.setBackground(new Color(255,255,255));
        textfield4.setForeground(new Color(0,0,0));
        textfield4.setEnabled(true);
        textfield4.setFont(new Font("sansserif",0,12));
        textfield4.setText("");
        textfield4.setVisible(true);

        //adding components to contentPane panel
        panel1.add(button1);
        panel1.add(button2);
        panel3.add(button3);
        panel3.add(button4);
        panel1.add(label1);
        panel3.add(label11);
        panel3.add(label12);
        panel3.add(label13);
        panel3.add(label14);
        panel1.add(label2);
        panel1.add(label3);
        panel1.add(label4);
        panel2.add(label6);
        panel2.add(label7);
        panel2.add(label8);
        panel2.add(label9);
        panel2.add(label5);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        panel1.add(textfield1);
        panel1.add(textfield2);
        panel1.add(textfield3);
        panel1.add(textfield4);

        //adding panel to JFrame and seting of window position and close operation
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }

    public void actionPerformed(ActionEvent ev){
        if(ev.getActionCommand().contentEquals("Registrar")){
            if (e.getC1() == null){
                Candidato c = new Candidato();
                c.setNombre(textfield1.getText());
                label5.setText(textfield1.getText());
                e.setC1(c);
            }else if (e.getC2() == null){
                Candidato c = new Candidato();
                c.setNombre(textfield1.getText());
                e.setC2(c);
            }else if (e.getC3() == null){
                Candidato c = new Candidato();
                c.setNombre(textfield1.getText());
                e.setC3(c);
            }else{
                System.out.println("Llegaste tarde a la elección");
            }
        }else if(ev.getActionCommand().contentEquals("Limpiar")){
            System.out.println(e.getC1().getNombre() + " - " + e.getC1().getVotos());
            System.out.println(e.getC2().getNombre() + " - " + e.getC2().getVotos());
            System.out.println(e.getC3().getNombre() + " - " + e.getC3().getVotos());
        }else if(ev.getActionCommand().contentEquals("Candidato 1")){
            System.out.println("Candidato 1");
        }
    }



}