/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculartiempoejecucion;



/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Ordenamientos {

    public double [] ordInsercion(double [] arr, int n) {
        
        double [] res = new double[n];
 
        clonarArreglo(res, arr);
        
        int i, j;
        double aux;
        long tiempoInicio, tiempoFinal, resTiempo;
        
        tiempoInicio = System.nanoTime();
        
        for(i=1; i<n; i++) {
            aux = res[i];
            j=i-1;
            
            while(j>=0 && res[j]>aux) {
                res[j+1] = res[j];
                j=j-1;
            }
            
            res[j+1] = aux;
        }
        
        tiempoFinal = System.nanoTime();
        resTiempo = tiempoFinal - tiempoInicio;
        
        System.out.println("Ordenamiento Inserción --> El tiempo de ordenamiento fue: " + (resTiempo) + " nanosegundos.\n");
        
        return res;
        
    }
    
    public double [] ordShell(double [] arr) {
        
        double [] res = new double[arr.length];
        int saltos, i, j, k;
        double aux;
        long tiempoInicio, tiempoFinal, resTiempo;
        
        clonarArreglo(res, arr);
        
        saltos = res.length/2;
        
        tiempoInicio = System.nanoTime();
        
        while(saltos > 0) {
            for(i=saltos; i<res.length; i++) {
                j=i-saltos;
                while(j >= 0) {
                    k=j+saltos;
                    if(res[j] <= res[k]) {
                        j=-1;
                    } else {
                        aux = res[j];
                        res[j] = res[k];
                        res[k] = aux;
                        j-=saltos;
                    }
                }
            }
            
            saltos=saltos/2;
        }
        
        tiempoFinal = System.nanoTime();
        resTiempo = tiempoFinal - tiempoInicio;
        
        System.out.println("Ordenamiento Shell --> El tiempo de ordenamiento fue: " + (resTiempo) + " nanosegundos.\n");
        
        
        return res;
        
        
    }
    
    //Método para imprimir un Arreglo.
    public void imprimir(double [] dato) {
        
        for(int i=0; i<dato.length; i++) {
            
            System.out.println("Valor " + (i+1) + " --> " + dato[i]);
        }
        
        System.out.println();
    }
    
    //Método para copiar los valores de un arreglo a otro.
    public void clonarArreglo(double [] nuevoArr, double [] arrOriginal) {
        
        for(int i=0; i<arrOriginal.length; i++) {
            
            nuevoArr[i] = arrOriginal[i];
        }
        
    }
    

}
    

