/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculartiempoejecucion;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Iniciar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
            Creamos un objeto llamado insercion para el ordenamiento insercion.
            Creamos un objeto llamado shell para el ordenamiento shell.
        
        */
        
        Ordenamientos insercion = new Ordenamientos();
        Ordenamientos shell = new Ordenamientos();
        
        
        /*
            Creamos un tres arreglos para almacenar valores.
        */
        
        double [] dato = new double[590];
        double [] ordenadoInsercion;
        double [] ordenadoShell;
        
        /*
            Creamos un objeto DecimalFormatSymbols llamado separador para
            que nos ponga el simbolo "." en vez de "," ya que si no se hace esto
            al momento de querer hacer un parseo, nos marcará error.

        */
        DecimalFormatSymbols separador = new DecimalFormatSymbols();
        separador.setDecimalSeparator('.');
        DecimalFormat formateador = new DecimalFormat("###.000", separador);
        
        /*
            Rellenamos nuestro Arreglo llamado dato con números
            aleatorios.
        */
        
        for(int i=0; i<590; i++) {
            
            double random = ((double)(Math.random() * 590) + 1);

            
            //String temp = (formateador.format(random));
 
            //random = Double.parseDouble(temp);
            
            random = Double.parseDouble(formateador.format(random));

            dato[i] = random;
        }
        
        
        
        ordenadoInsercion = insercion.ordInsercion(dato, dato.length);
        System.out.println("***** VALORES ORDENADOS POR EL MÉTODO INSERCIÓN *****");
        insercion.imprimir(ordenadoInsercion);
        
        ordenadoShell = shell.ordShell(dato);
        System.out.println("***** VALORES ORDENADOS POR EL MÉTODO SHELL *****");
        shell.imprimir(ordenadoShell);

    }
    
}
