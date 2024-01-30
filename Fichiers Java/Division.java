package projet_1;

public class Division extends OperationBinaire implements CalculMath{
public Division(double x,double y){
		
		super(x,y);
	}
	@Override

		public double Calculer(double x, double y) {
			return x/y;
		}
	@Override
	public void result() 
	{
		if (y==0) {
			System.out.println(" Math ERROR");
		}
		else 
			System.out.println("le resultat est : "+Calculer(x,y));
}
}