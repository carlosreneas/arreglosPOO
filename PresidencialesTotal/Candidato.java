
/**
 * Write a description of class Candidato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Candidato
{
    // instance variables - replace the example below with your own
    private String nombre;
    private String partido;
    private Integer votos;

    /**
     * Constructor for objects of class Candidato
     */
    public Candidato()
    {
        // initialise instance variables
        this.votos = 0;
    }
    
    public Candidato(String nombre, String partido)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.partido = partido;
        this.votos = 0;
    }

    
    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad partido*/
    public String getPartido(){
        return this.partido;
    }//end method getPartido

    /**Metodo de modificación a la propiedad partido*/
    public void setPartido(String partido){
        this.partido = partido;
    }//end method setPartido

    /**Metodo de acceso a la propiedad votos*/
    public Integer getVotos(){
        return this.votos;
    }//end method getVotos

    /**Metodo de modificación a la propiedad votos*/
    public void setVotos(Integer votos){
        this.votos = votos;
    }//end method setVotos
    
    public void votar(){
        this.votos ++;
    }
}