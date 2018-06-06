import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
/**
 * Write a description of class Vista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vista extends JFrame
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

    /**
     * Constructor for objects of class Vista
     */
    public Vista()
    {
        // initialise instance variables
        this.setTitle("Elecciones Presidenciales 2018");
        this.setSize(778,633);
        
        this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon("images/tarjeton.jpg")));
        
        c1 = new CandidatoBoton("Gustavo Petro", "Colombia Humana", 52, 82, "Petro");
        c2 = new CandidatoBoton("Promotores Voto en Blanco", "Partido Reivindicacion Etnica", 228, 82, "Reinvindicacion");
        c3 = new CandidatoBoton("Ivan Duque", "Partido Centro Democratico", 402, 82, "Duque");
        c4 = new CandidatoBoton("Humberto de la Calle", "Coalision Partido Liberal Colombiano", 574, 82, "DeLaCalle");
        
        c5 = new CandidatoBoton("Jorge Antonio Trujillo", "Todos Somos Colombia", 52, 248, "Trujillo");
        c6 = new CandidatoBoton("Sergio Fajardo", "Coalicion Colombia", 228, 248, "Fajardo");
        c7 = new CandidatoBoton("Viviane Morales", "Partido Somos", 402, 248, "Morales");
        c8 = new CandidatoBoton("Piedad Cordoba", "Poder Ciudadano", 574, 248, "PiedadCordoba");
        
        c9 = new CandidatoBoton("German Vargas Lleras", "Mejor Vargas Lleras", 52, 414, "VargasLleras");
        c10 = new CandidatoBoton("Voto en Blanco", "Voto en Blanco", 228, 414, "VotoenBlanco");
        
        this.add(c1);
        this.add(c2);
        this.add(c3);
        this.add(c4);
        
        this.add(c5);
        this.add(c6);
        this.add(c7);
        this.add(c8);
        
        this.add(c9);
        this.add(c10);
        
        this.setVisible(true);
        this.setResizable(false);
    }

}
