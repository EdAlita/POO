
public class DatosGraficos {
	private String Categoria;
	private double Valor;
	
	public DatosGraficos(String Categoria, double valor){
		this.Categoria=Categoria;
		this.Valor=valor;
	}

	public String getCategoria() {
		return Categoria;
	}

	public void setCategoria(String categoria) {
		this.Categoria = categoria;
	}

	public double getValor() {
		return Valor;
	}

	public void setValor(double valor) {
		this.Valor = valor;
	}
	
	
}
