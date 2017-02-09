public class PruebaArreglos{
	public int suma(int[] arreglo){
		int resultado=0;
		for(int i=0;i<arreglo.length;i++){
			resultado+=resultado+arreglo[i];		
		}
		return resultado;
  	}

	public int maximo(int[] arreglo){
		int maximo=arreglo[0];
		for(int i=1;i<arreglo.length;i++){
			if(maximo<arreglo[i]){
				maximo=arreglo[i];
			}
		}
		return maximo;
	}

	public double promedio(int[] arreglo){
		return ((double)suma(arreglo))/arreglo.length;
	}

	public static void main(String[] args){
		PruebaArreglos tmp=new PruebaArreglos();
		int[] miArreglo={8,9,10,100,23,45};
		int res=tmp.suma(miArreglo);
		System.out.println("La suma es "+res);
		System.out.println("El valor mayor es "+tmp.maximo(miArreglo));
		System.out.println("El promedio es "+tmp.promedio(miArreglo));
	}
}
