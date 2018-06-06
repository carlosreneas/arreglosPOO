import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
/**
 * Write a description of class Vista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VistaJPanel extends JFrame
{
    // instance variables - replace the example below with your own
    private JPanel registro;
    private JPanel votacion;
    
    private CandidatoBoton c1;
    private CandidatoBoton c2;
    private CandidatoBoton c3;
    private CandidatoBoton c4;
    private CandidatoBoton c5;
    private CandidatoBoton c6;
    private CandidatoBoton c7;
    private CandidatoBoton c8;
    private CandidatoBoton c9;
    private CandidatoBoton c10;
    
    private JLabel lcedula;
    private JLabel lnombre;
    private JLabel ledad;
    private JTextField tcedula;
    private JTextField tnombre;
    private JTextField tedad;
    private JButton bvotar;
    private JButton bfinalizar;
    

    /**
     * Constructor for objects of class Vista
     */
    public VistaJPanel()
    {
        // initialise instance variables
        this.setTitle("Elecciones Presidenciales 2018");
        this.setSize(778,633);
        
        this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon("images/tarjeton.jpg")));
         
        registro = new JPanel(new GridLayout(4,2));
        registro.setBounds(200, 150, 374, 200);
        
        lcedula = new JLabel("Cedula");
        lnombre = new JLabel("Nombre");
        ledad = new JLabel("Edad");
        
        tcedula = new JTextField();
        tnombre = new JTextField();
        tedad = new JTextField();
        
        bvotar = new JButton("Votar");
        bfinalizar = new JButton("Finalizar");
        
        registro.add(lcedula);
        registro.add(tcedula);
        registro.add(lnombre);
        registro.add(tnombre);
        registro.add(ledad);
        registro.add(tedad);
        registro.add(bvotar);
        registro.add(bfinalizar);
        
        this.add(registro);
        
        votacion = new JPanel(null);
        votacion.setBounds(50, 110, 674, 480);
        votacion.setOpaque(false);
        
        c1 = new CandidatoBoton("Gustavo Petro", "Colombia Humana", 0, 0, "Petro");
        c2 = new CandidatoBoton("Promotores Voto en Blanco", "Partido Reivindicacion Etnica", 176, 0, "Reinvindicacion");
        c3 = new CandidatoBoton("Ivan Duque", "Partido Centro Democratico", 350, 0, "Duque");
        c4 = new CandidatoBoton("Humberto de la Calle", "Coalision Partido Liberal Colombiano", 522, 0, "DeLaCalle");
        
        c5 = new CandidatoBoton("Jorge Antonio Trujillo", "Todos Somos Colombia", 0, 166, "Trujillo");
        c6 = new CandidatoBoton("Sergio Fajardo", "Coalicion Colombia", 176, 166, "Fajardo");
        c7 = new CandidatoBoton("Viviane Morales", "Partido Somos", 350, 166, "Morales");
        c8 = new CandidatoBoton("Piedad Cordoba", "Poder Ciudadano", 522, 166, "PiedadCordoba");
        
        c9 = new CandidatoBoton("German Vargas Lleras", "Mejor Vargas Lleras", 0, 332, "VargasLleras");
        c10 = new CandidatoBoton("Voto en Blanco", "Voto en Blanco", 176, 332, "VotoenBlanco");
        
        votacion.add(c1);
        votacion.add(c2);
        votacion.add(c3);
        votacion.add(c4);
        
        votacion.add(c5);
        votacion.add(c6);
        votacion.add(c7);
        votacion.add(c8);
        
        votacion.add(c9);
        votacion.add(c10);
        
        votacion.setVisible(false);
        
        this.add(votacion);
        
        this.setVisible(true);
        this.setResizable(false);
    }

}