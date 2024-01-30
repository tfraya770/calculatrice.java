package projet_1;

public class Soustraction extends OperationBinaire implements CalculMath{
	public Soustraction(double x,double y){
		
		super(x,y);
	}
	@Override
	public double Calculer(double x,double y) {

			return x-y;
		}
	public void result() {
		System.out.println("le resultat est : "+Calculer(x,y));

	}
}