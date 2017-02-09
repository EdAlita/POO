public class UsaTermometro{
	public static void main(String[] args){
	Termometro gda=new Termometro();
	System.out.println("La temperatura en Gdl es "+gda.getTemp());

	Termometro mty=new Termometro(29);

	gda.setTemp(20);
	System.out.println("La temperatura en Gdl es "+mty.getTemp());
	System.out.println("La temperatura en Gdl es "+gda.getTemp());
	}
}