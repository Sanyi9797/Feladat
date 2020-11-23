/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat;

import java.util.Scanner;

/**
 *
 * @author Felhasználó
 */
public class Feladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        int n = 0;
        
        Scanner beker = new Scanner(System.in);
        
        System.out.print("Kérem adja meg 'n' értékét:  ");
        n = beker.nextInt();
         
        
        System.out.println("A páros számok: ");
        for ( i = 0; i <= n; i++  ){
            
            if ( i % 2 == 0 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        
        System.out.println("A páratlan számok: ");
        for ( i = 0; i <= n; i++  ){
            
            if ( i % 2 >= 1 ){
                
                System.out.print( i + ", ");
                
            }
            
        }
        
        System.out.println("\n");
        System.out.println("Itt a program vége.");
    }
    
}
