/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author eloy011
 */
public class Vector {
    public int valor;
    
    public String Visualizar(int i, int[] vector) {
        
         System.out.print("v={");
          for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         return null;
    }
    
}
