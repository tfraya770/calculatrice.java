package projet_1;

public class Sin extends OperationUnaire implements CalculMath{
	

	
		

		public Sin (double n){
			super(n);
		}

		@Override
		public double Calculer(double n,double NULL) {
			
			return (Math.sin(n));
		}

		@Override
		public void result() {
			System.out.println(" le resultat : "+Calculer(n,0.0));
			
		}
}
