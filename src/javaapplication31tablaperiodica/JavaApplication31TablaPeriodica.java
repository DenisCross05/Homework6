/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31tablaperiodica;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author G6
 */
public class JavaApplication31TablaPeriodica {
    static Elemento tmp;
    static Elemento tmp_ant;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Elemento> elementos = new ArrayList(); 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de elementos que desea agregar: ");
               
        int n = scan.nextInt(); 
        System.out.println(" ");
        
        for( int i = 0; i<n; i++){
            Elemento e = new Elemento();
            System.out.println("Ingrese el nombre del elemento:"+i);
            e.nombre = scan.next();
            System.out.println("Ingrese la conductividad termica: ");
            e.conductividad_termica = scan.nextFloat();
            System.out.println("Ingrese la conductividad electrica: ");
            e.conductividad_electrica = scan.nextFloat();
            elementos.add(e);
        }
        tmp = elementos.get(0);
        tmp_ant = tmp;
        int mayor = 0;
        
        
            elementos.forEach ( (Elemento item) ->{
            if(item.conductividad_electrica > tmp.conductividad_electrica && item.conductividad_termica>tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp = item;
            }         
            }
            );
            System.out.println("Mejor conductividad electrica: "+tmp.nombre + " " +tmp.conductividad_electrica);
            System.out.println("Mejor conductividad termica: "+tmp.nombre + " "+tmp.conductividad_termica);
            
            elementos.forEach ( (Elemento item) ->{
            if(item.conductividad_electrica < tmp.conductividad_electrica && item.conductividad_termica < tmp.conductividad_termica){
           tmp_ant = tmp;
           tmp = item;
            }         
            }
            );
            System.out.println("Peor conductividad electrica: "+tmp.nombre+ " " +tmp.conductividad_electrica);
            System.out.println("Peor conductividad termica: "+tmp.nombre+ " " +tmp.conductividad_termica);
        
    }
    
}
