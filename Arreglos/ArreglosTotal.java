
/**
 * Write a description of class Arreglos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArreglosTotal
{
    // instance variables - replace the example below with your own
    private Integer n = 10;
    private Integer[] x = new Integer[n];

    /**
     * Constructor for objects of class Arreglos
     */
    public ArreglosTotal()
    {
        for (int i = 0; i < x.length; i++){
            x[i] = ((Double)(Math.random()*100D)).intValue();
        }
        
        System.out.println("Arreglo Inicial");
        for (Integer m: x){
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println(" ");
        
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if(x[i] < x[j]){
                    Integer a = x[i];
                    x[i] = x[j];
                    x[j] = a;
                }
                for (Integer m: x){
                    System.out.print(m);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        } 
        
        System.out.println("Arreglo Ordenado Menor a Mayor");
        for (Integer m: x){
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println(" ");
        /*
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < x.length; j++){
                if(x[i] > x[j]){
                    Integer a = x[i];
                    x[i] = x[j];
                    x[j] = a;
                }
            }
        } 
        
        System.out.println("Arreglo Ordenado Mayor a Menor");
        for (Integer m: x){
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println(" ");
        */
    }
    


    
}