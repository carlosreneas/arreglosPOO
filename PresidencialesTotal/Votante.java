
/**
 * Write a description of class Votante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Votante
{
    // instance variables 
    public static Integer cantidad = 0;
    private String cedula;
    private String nombre;
    private String edad;

    /**
     * Constructor for objects of class Votante
     */
    public Votante()
    {
        cantidad ++;
    }
    
    public Votante(String cedula, String nombre, String edad)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        cantidad ++;
    }

    /**Metodo de acceso a la propiedad cedula*/
    public String getCedula(){
        return this.cedula;
    }//end method getCedula

    /**Metodo de modificación a la propiedad cedula*/
    public void setCedula(String cedula){
        this.cedula = cedula;
    }//end method setCedula

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad edad*/
    public String getEdad(){
        return this.edad;
    }//end method getEdad

    /**Metodo de modificación a la propiedad edad*/
    public void setEdad(String edad){
        this.edad = edad;
    }//end method setEdad

}