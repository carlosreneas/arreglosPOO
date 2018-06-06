
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
    private String numero;
    private String grado;
    private String jornada;
    private Integer votos = 0;

    /**
     * Constructor for objects of class Candidato
     */
    public Candidato()
    {
        // initialise instance variables
        
    }

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad numero*/
    public String getNumero(){
        return this.numero;
    }//end method getNumero

    /**Metodo de modificación a la propiedad numero*/
    public void setNumero(String numero){
        this.numero = numero;
    }//end method setNumero

    /**Metodo de acceso a la propiedad grado*/
    public String getGrado(){
        return this.grado;
    }//end method getGrado

    /**Metodo de modificación a la propiedad grado*/
    public void setGrado(String grado){
        this.grado = grado;
    }//end method setGrado

    /**Metodo de acceso a la propiedad jornada*/
    public String getJornada(){
        return this.jornada;
    }//end method getJornada

    /**Metodo de modificación a la propiedad jornada*/
    public void setJornada(String jornada){
        this.jornada = jornada;
    }//end method setJornada

    /**Metodo de acceso a la propiedad votos*/
    public Integer getVotos(){
        return this.votos;
    }//end method getVotos

    /**Metodo de modificación a la propiedad votos*/
    public void setVotos(Integer votos){
        this.votos = votos;
    }//end method setVotos

}