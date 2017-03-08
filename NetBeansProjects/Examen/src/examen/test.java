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
public class test {
    public static void main(String[] args) {
        // TODO code application logic here
        int []v= new int[5];
        v[0]=2;
        v[1]=4;
        v[2]=6;
        v[3]=8; 
        CambiarLongitud p=new CambiarLongitud();
        NoCambiarLongitud n=new NoCambiarLongitud();
        p.valor=10;
        n.modificar(v);
        p.borrar(v);
        p.insertar(v);
    }
    
}
