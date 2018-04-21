
public class EjemploException {
	
	public void metodoA() throws MyException{
		this.metodoB();
	}

	public void metodoB() throws MyException{
		this.metodoC();
	}
	
	public void metodoC() throws MyException{
		this.metodoD();
	}
	
	public void metodoD() throws MyException{
		throw new MyException("Ocurrio un Error en D");
	}

	public static void main(String[] args) {
		try{
				EjemploException ee=new EjemploException();
				ee.metodoA();
		}
		catch(MyException ex){
				System.out.println("Ocurrio un Error!");
		}

	}

}
