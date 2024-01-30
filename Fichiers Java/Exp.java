package projet_1;

public class Exp extends OperationUnaire implements CalculMath {


	public Exp(double n){
		super(n);
	}

	@Override
	public double Calculer(double n ,double NULL) {
		
		return (Math.exp(n));
	}

	@Override
	public void result() {
		System.out.println(" le resultat : "+Calculer(n,0.0));
		
	}

	
}


