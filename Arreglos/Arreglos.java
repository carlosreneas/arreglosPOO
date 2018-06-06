
/**
 * Write a description of class Arreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arreglos
{
    // instance variables - replace the example below with your own
    private Integer n = 10;
    private Integer[] x = new Integer[n];

    /**
     * Constructor for objects of class Arreglos
     */
    public Arreglos()
    {
        
        
    }
    public void resultado(){
        llenar();
        imprimir(x, "Arreglo Inicial");
        burbujaMenorMayor(x);
        burbujaMayorMenor(x);
        
    }
    public void llenar(){
        // initialise instance variables
        for (int i = 0; i < x.length; i++){
            x[i] = ((Double)(Math.random()*100D)).intValue();
        }
    }
    
    public void imprimir(Integer[] x, String titulo){
        System.out.println(titulo);
        for (Integer m: x){
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
    
    public void burbujaMenorMayor(Integer[] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if(x[i] < x[j]){
                    Integer a = x[i];
                    x[i] = x[j];
                    x[j] = a;
                }
            }
        } 
        
        imprimir(x, "Ordenamiento de Menor a Mayor");
    }
    
    public void burbujaMayorMenor(Integer[] x){
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if(x[i] > x[j]){
                    Integer a = x[i];
                    x[i] = x[j];
                    x[j] = a;
                }
            }
        } 
        
        imprimir(x, "Ordenamiento de Mayor a Menor");
    }

    
}
