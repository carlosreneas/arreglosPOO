
import java.util.Scanner;


public class Trabajador

{
    public Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Double sueldo;
   
    public Trabajador()
    {    
    }
    
    public Trabajador( Integer id, String nombre, String direccion, 
        String telefono, Double sueldo)
    {
               
    this.id=id;
    this.nombre=nombre;
    this.direccion=direccion;
    this.telefono=telefono;
    this.sueldo=sueldo;
    }
    
   
    /**Metodo de acceso a la propiedad id*/
    public Integer getId(){
        return this.id;
    }//end method getId

    /**Metodo de modificación a la propiedad id*/
    public void setId(Integer id){
        this.id = id;
    }//end method setId

    /**Metodo de acceso a la propiedad nombre*/
    public String getNombre(){
        return this.nombre;
    }//end method getNombre

    /**Metodo de modificación a la propiedad nombre*/
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//end method setNombre

    /**Metodo de acceso a la propiedad direccion*/
    public String getDireccion(){
        return this.direccion;
    }//end method getDireccion

    /**Metodo de modificación a la propiedad direccion*/
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }//end method setDireccion

    /**Metodo de acceso a la propiedad telefono*/
    public String getTelefono(){
        return this.telefono;
    }//end method getTelefono

    /**Metodo de modificación a la propiedad telefono*/
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }//end method setTelefono

    /**Metodo de acceso a la propiedad sueldo*/
    public Double getSueldo(){
        return this.sueldo;
    }//end method getSueldo

    /**Metodo de modificación a la propiedad sueldo*/
    public void setSueldo(Double sueldo){
        this.sueldo = sueldo;
    }//end method setSueldo

   

 }