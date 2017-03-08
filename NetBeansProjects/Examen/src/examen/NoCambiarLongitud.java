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
public class NoCambiarLongitud extends Vector{

    
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado
   public void modificar(int []vector){
     	int i;  
        int p=1;
       //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Modificamos el array
       	  if(p<vector.length){ 
              ModificaElemento(vector, p);
             }
       //Mostramos los elementos del array  
       Visualizar(i,vector);
    }



    void ModificaElemento(int[] v, int p) {
        //mostramos su contenido           			
   System.out.println("Elemento a modificar="+v[p]);
       v[p]=this.valor;
    }
    
    
}
