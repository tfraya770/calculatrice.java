package projet_1;

public class Log extends OperationUnaire implements CalculMath{




	public Log (double n){
		super(n);
	}



	@Override
	public double Calculer(double n ,double NULL) {

		return (Math.log(n));



	}

	@Override
	public void result() {
		if (n<=0){
			System.out.println("Math ERROR");}
		else

			System.out.println(" le resultat : "+Calculer(n ,0.0));

	}}
