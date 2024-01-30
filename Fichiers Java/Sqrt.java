package projet_1;

public class Sqrt extends OperationUnaire implements CalculMath{
	

	public Sqrt (double n){
			super(n);
		}

	@Override
	public double Calculer(double n,double NULL) {
				return (Math.sqrt(n));
			
		
	}

	@Override
	public void result() {
		if(n<0) {
			System.out.println(" Math ERROR");
		}
		else
		System.out.println(" le resultat : "+Calculer(n,0.0));
		
	}}


