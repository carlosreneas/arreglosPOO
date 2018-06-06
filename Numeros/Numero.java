
/**
 * Write a description of class Numero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Numero
{
    // instance variables - replace the example below with your own
    private Integer x;
    private String estado;

    /**
     * Constructor for objects of class Numero
     */
    public Numero()
    {
        // initialise instance variables
        x = 0;
    }
    
    public Numero(Integer x) {
        this.x = x;
    }
    
    public String esPar() {
        if(this.x%2==0)
            return "es Par";
        else
            return "es Impar";
    }
    
    public String esPrimo () {
        for(int i = 2; i<x; i++ ){
            if(x%i == 0){
                return "no es Primo";
            }
        }
        return "es Primo";
    }
    
    public String esHappy() {
        Integer res = this.x;
        while(res != 1){
            res = cuadrados(res);
            if(res == 1){
                return "es Happy";
            }else if(res == x || res == x*x){
                return "no es Happy";
            }
            
        }
        return "es Happy";
    }
    
    public Integer cuadrados(Integer n){
        Integer res = 0;
        //Integer n = this.x;
        while(n>0){
            Integer d = n % 10;
            n = n/10;
            res = res + d*d;
        }
        return res;
    }

    /**Metodo de acceso a la propiedad x*/
    public Integer getX(){
        return this.x;
    }//end method getX

    /**Metodo de modificación a la propiedad x*/
    public void setX(Integer x){
        this.x = x;
    }//end method setX

    /**Metodo de acceso a la propiedad estado*/
    public String getEstado(){
        return this.estado;
    }//end method getEstado

    /**Metodo de modificación a la propiedad estado*/
    public void setEstado(String estado){
        this.estado = estado;
    }//end method setEstado

}