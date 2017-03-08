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
public class CambiarLongitud extends Vector{
     
    
    //metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos
    public void borrar (int []vector){
       int posicion=1,i;
       int longitud=vector.length;
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<longitud;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<longitud){ 
                    System.out.println("Elemento a borrar="+vector[posicion]);
        for(i=posicion;i<vector.length-1;i++)
              vector[i]=vector[i+1];                                       
          }
   //Mostramos los elementos del array  
      Visualizar(i,vector);        
      }
     

//metodo que inserta un  elemento en la posicion p desplazando a la derecha todos los elementos
public void insertar (int []vector){
       int posicion=1, i;	  
      //mostramos su contenido 
        //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<vector.length;i++){
             System.out.print(vector[i]+",");
             }    
         System.out.println("}");
         //Borramos el elemento
       	 if(posicion<vector.length){ 
             System.out.println("Elemento a insertar=" + this.valor);
                for (i = vector.length - 1; i > posicion; i--) {
                    vector[i] = vector[i - 1];
                }
                vector[posicion] = this.valor;
            
          }
   //Mostramos los elementos del array  
       Visualizar(i,vector);
}
public void modificar(int []v){
     	int i;  
        int p=1;
       //Mostramos los elementos del array  
       System.out.print("v={");
         for (i=0;i<v.length;i++){
             System.out.print(v[i]+",");
             }    
         System.out.println("}");
         //Modificamos el array
       	  if(p<v.length){ 
              ModificaElemento(v, p);
             }
       //Mostramos los elementos del array  
       System.out.print("v={");
       for (i=0;i<v.length;i++){
           System.out.print(v[i]+",");
       }    
         System.out.println("}");  
        
    }



    void ModificaElemento(int[] v, int p) {
        //mostramos su contenido           			
   System.out.println("Elemento a modificar="+v[p]);
       v[p]=this.valor;
    }

    


    
}
