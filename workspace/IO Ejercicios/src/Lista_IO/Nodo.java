package Lista_IO;


public class Nodo {
	private String nota;
	private String nombre;
	private Nodo derecha;
	private Nodo izquierda;
	
	public Nodo (String nota, String nombre){
		this.nota=nota;
		this.nombre=nombre;
		this.derecha=null;
		this.izquierda=null;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnota() {
		return nota;
	}
	public void setnota(String nota) {
		this.nota = nota;
	}
	public Nodo getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
	public Nodo getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	public String toString() {
		return  nota+","+nombre+"\n";
	}


}
