import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;
/**
 * Write a description of class Vista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VistaJPanelEvento extends JFrame implements ActionListener
{
    // instance variables - replace the example below with your own
    private JPanel registro;
    private JPanel votacion;
    private JPanel resultado;
    
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
    
    private JLabel lcedula;
    private JLabel lnombre;
    private JLabel ledad;
    private JTextField tcedula;
    private JTextField tnombre;
    private JTextField tedad;
    private JButton bvotar;
    private JButton bfinalizar;
    
    private JLabel lresultado;
    

    /**
     * Constructor for objects of class Vista
     */
    public VistaJPanelEvento()
    {
        // initialise instance variables
        this.setTitle("Elecciones Presidenciales 2018");
        this.setSize(778,633);
        
        this.setContentPane(new javax.swing.JLabel(new javax.swing.ImageIcon("images/tarjeton.jpg")));
        
        /** Comienza el panel del registro de votantes */
        registro = new JPanel(new GridLayout(4,2));
        registro.setBounds(200, 150, 374, 200);
        
        lcedula = new JLabel("Cedula");
        lnombre = new JLabel("Nombre");
        ledad = new JLabel("Edad");
        
        tcedula = new JTextField();
        tnombre = new JTextField();
        tedad = new JTextField();
        
        bvotar = new JButton("Votar");
        bfinalizar = new JButton("Finalizar");
        
        bvotar.addActionListener(this);
        bfinalizar.addActionListener(this);
        
        registro.add(lcedula);
        registro.add(tcedula);
        registro.add(lnombre);
        registro.add(tnombre);
        registro.add(ledad);
        registro.add(tedad);
        registro.add(bvotar);
        registro.add(bfinalizar);
        
        this.add(registro);
        /** Finaliza el panel de registro de votantes */
        
        /** Comienza el panel de resultados de las votaciones */
        resultado = new JPanel(new GridLayout(1,1));
        resultado.setBounds(200, 150, 374, 200);
        lresultado = new JLabel("Resultado");
        lresultado.setHorizontalTextPosition(JLabel.CENTER);
        resultado.add(lresultado);
        resultado.setVisible(false);
        this.add(resultado);
        /** Finaliza el panel de resultados de las votaciones */
        
        /** Comienza el panel del tarjeton de votaciones */
        votacion = new JPanel(null);
        votacion.setBounds(50, 110, 674, 480);
        votacion.setOpaque(false);
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        
        try {
             // Apertura del fichero y creacion de BufferedReader para poder
             // hacer una lectura comoda (disponer del metodo readLine()).
             archivo = new File ("data/candidatos.txt");
             fr = new FileReader (archivo);
             br = new BufferedReader(fr);
    
             // Lectura del fichero
             String linea;
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c1 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c2 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c3 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c4 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c5 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c6 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c7 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c8 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c9 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }
             
             if ((linea=br.readLine())!=null) {
                 String[] dato = linea.split(",");
                 c10 = new CandidatoBoton(dato[0], dato[1], Integer.parseInt(dato[2]), Integer.parseInt(dato[3]), dato[4]);
             }

          }
          catch(Exception e){
             e.printStackTrace();
          }finally{
             // En el finally cerramos el fichero, para asegurarnos
             // que se cierra tanto si todo va bien como si salta 
             // una excepcion.
             try{                    
                if( null != fr ){   
                   fr.close();     
                }                  
             }catch (Exception e2){ 
                e2.printStackTrace();
             }
          }
        
        /*
       
        c2 = new CandidatoBoton("Promotores Voto en Blanco", "Partido Reivindicacion Etnica", 176, 0, "Reinvindicacion");
        c3 = new CandidatoBoton("Ivan Duque", "Partido Centro Democratico", 350, 0, "Duque");
        c4 = new CandidatoBoton("Humberto de la Calle", "Coalision Partido Liberal Colombiano", 522, 0, "DeLaCalle");
        
        c5 = new CandidatoBoton("Jorge Antonio Trujillo", "Todos Somos Colombia", 0, 166, "Trujillo");
        c6 = new CandidatoBoton("Sergio Fajardo", "Coalicion Colombia", 176, 166, "Fajardo");
        c7 = new CandidatoBoton("Viviane Morales", "Partido Somos", 350, 166, "Morales");
        c8 = new CandidatoBoton("Piedad Cordoba", "Poder Ciudadano", 522, 166, "PiedadCordoba");
        
        c9 = new CandidatoBoton("German Vargas Lleras", "Mejor Vargas Lleras", 0, 332, "VargasLleras");
        c10 = new CandidatoBoton("Voto en Blanco", "Voto en Blanco", 176, 332, "VotoenBlanco");
        */
        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);
        c4.addActionListener(this);
        c5.addActionListener(this);
        c6.addActionListener(this);
        c7.addActionListener(this);
        c8.addActionListener(this);
        c9.addActionListener(this);
        c10.addActionListener(this);
        
        votacion.add(c1);
        votacion.add(c2);
        votacion.add(c3);
        votacion.add(c4);
        
        votacion.add(c5);
        votacion.add(c6);
        votacion.add(c7);
        votacion.add(c8);
        
        votacion.add(c9);
        votacion.add(c10);
        
        votacion.setVisible(false);
        
        this.add(votacion);
        /** Finaliza el panel del tarjeton de votaciones */
        
        this.setVisible(true);
        this.setResizable(false);
    }
    
    public void actionPerformed(ActionEvent e){
        String comando = e.getActionCommand();
        
        if(comando.contentEquals("Votar")){
            Votante v = new Votante(tcedula.getText(), tnombre.getText(), tedad.getText());
            registro.setVisible(false);
            votacion.setVisible(true);
        }else if(comando.contentEquals("Finalizar")){
            registro.setVisible(false);
            resultado.setVisible(true);
            String res = "";
            res = res + c1.getCandidato().getNombre() + ": " + c1.getCandidato().getVotos() + 
                " con porcentaje " + 100*c1.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c2.getCandidato().getNombre() + ": " + c2.getCandidato().getVotos() + " con porcentaje " + 100*c2.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c3.getCandidato().getNombre() + ": " + c3.getCandidato().getVotos() + " con porcentaje " + 100*c3.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c4.getCandidato().getNombre() + ": " + c4.getCandidato().getVotos() + " con porcentaje " + 100*c4.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c5.getCandidato().getNombre() + ": " + c5.getCandidato().getVotos() + " con porcentaje " + 100*c5.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c6.getCandidato().getNombre() + ": " + c6.getCandidato().getVotos() + " con porcentaje " + 100*c6.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c7.getCandidato().getNombre() + ": " + c7.getCandidato().getVotos() + " con porcentaje " + 100*c7.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c8.getCandidato().getNombre() + ": " + c8.getCandidato().getVotos() + " con porcentaje " + 100*c8.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c9.getCandidato().getNombre() + ": " + c9.getCandidato().getVotos() + " con porcentaje " + 100*c9.getCandidato().getVotos()/Votante.cantidad + "%<br/>";
            res = res + c10.getCandidato().getNombre() + ": " + c10.getCandidato().getVotos() + " con porcentaje " + 100*c10.getCandidato().getVotos()/Votante.cantidad + "<br/>";
            lresultado.setText("<html>"+res+"</html>");
        }else{
           ((CandidatoBoton)e.getSource()).getCandidato().votar();
           registro.setVisible(true);
           votacion.setVisible(false); 
        }
    }

}