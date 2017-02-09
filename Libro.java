//A01227886 Edwing Yair Ulin Briseno
//Fundamentos de Programacion orientada a objetos
//16 de Enero del 2017


public class Libro{
	private String titulo,
	autor,
	editorial,
	isbn;
	
	public Libro(){
		titulo="Colmillo Blanco";
		autor="Jack London";
		editorial="Planeta";
		isbn="1254625258";
	}

	public Libro(String t,String a,String e,String i){
		titulo=t;
		autor=a;
		editorial=e;
		isbn=i;
	}

	public void setTitulo(String t){
		titulo=t;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setAutor(String a){
		autor=a;
	}

	public String getAutor(){
		return autor;
	}
	
	public void setEditorial(String e){
		editorial=e;
	}

	public String getEditorial(){
		return editorial;
	}

	public void setIsbn(String i){
		isbn=i;
	}

	public String getIsbn(){
		return isbn;
	}
	public static void main(String[] args){
		Libro l1=new Libro();
		System.out.println("El titulo es "+l1.getTitulo()+" de "+l1.getAutor()+" de editorial "+l1.getEditorial()+" con isbn "+l1.getIsbn());
		
		Libro l2=new Libro("El Señor de las Moscas","William Golding","Debate","1254896");
		System.out.println("El titulo es "+l2.getTitulo()+" de "+l2.getAutor()+" de editorial "+l2.getEditorial()+" con isbn "+l2.getIsbn());

		l2.setIsbn("145236");
		l2.setEditorial("Planeta");
		System.out.println("El titulo es "+l2.getTitulo()+" de "+l2.getAutor()+" de editorial "+l2.getEditorial()+" con isbn "+l2.getIsbn());

		
	}
}