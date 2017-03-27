package Lista_IO;
import java.io.*;


public class Leer_lista {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader notas = null;
		BufferedReader nombres = null;
		Lista lista = new Lista(); 
		String l,n;
        try {
            notas = new BufferedReader(new FileReader("notas.txt"));
            nombres = new BufferedReader(new FileReader("nombres.txt"));
            
            while ((l = nombres.readLine()) != null) {
            	n = notas.readLine();
            	lista.insertarFinal(new Nodo(n,l));
            	
            }
        } finally {
            if (notas != null) {
                notas.close();
            }
        }
        System.out.print(lista.toString());


	}

}
