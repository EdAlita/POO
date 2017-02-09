public class UsaClock{
	public static void main(String[] args){
		Clock gda = new Clock();
		Clock tij = new Clock(8,48,30);
		Clock lon = new Clock(-10,3848381,919838455);

		gda.printTime();
		tij.printTime();
		lon.printTime();

		gda.setTime(23,59,59);
		gda.printTime();
		gda.incrementSeconds();
		gda.printTime();
		lon.setTime(8,48,59);
		

		gda.makeCopy(tij);
		boolean igual=gda.equals(tij);
		System.out.println("Las horas son iguales "+igual);
		igual=tij.equals(lon);
		System.out.println("Las horas son iguales "+igual);

		Clock LA=tij.getCopy();
		LA.printTime();
	}
}