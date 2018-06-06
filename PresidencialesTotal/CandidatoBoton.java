import javax.swing.*;
/**
 * Write a description of class CandidatoBoton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CandidatoBoton extends JButton
{
    
    Candidato candidato = new Candidato();
    /**
     * Constructor for objects of class CandidatoBoton
     */
    public CandidatoBoton(String nombre, String partido, Integer x, Integer y, String imagen)
    {
        // initialise instance variables
        candidato.setNombre(nombre);
        candidato.setPartido(partido);
        candidato.setVotos(0);

        this.setBounds(x,y,150,150);
        this.setIcon(new ImageIcon(this.getClass().getResource("/images/"+imagen+".jpg")));
        this.setBorder(null);
        this.setBackground(null);
        this.setForeground(null);
        this.setEnabled(true);
        this.setBorderPainted(false);
        this.setVisible(true);
        
    }

   
    /**Metodo de acceso a la propiedad candidato*/
    public Candidato getCandidato(){
        return this.candidato;
    }//end method getCandidato

    /**Metodo de modificación a la propiedad candidato*/
    public void setCandidato(Candidato candidato){
        this.candidato = candidato;
    }//end method setCandidato

}