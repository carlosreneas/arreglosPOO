
/**
 * Write a description of class Triqui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triqui
{
    // instance variables - replace the example below with your own
    private Integer[][] x = new Integer[3][3] ;

    /**
     * Constructor for objects of class Triqui
     */
    public Triqui()
    {
        // initialise instance variables
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                x[i][j] = ((Double)(Math.random()*100D)).intValue();
            }
        } 
        
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(x[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        } 
        
    }

    
}
