package projet_1;



public class Cos extends OperationUnaire implements CalculMath{
	




public Cos (double n ){
	super(n);
	
}



@Override
public void result() {
	System.out.println(" le resultat : "+Calculer(n,0.0));
	
}



@Override
public double Calculer(double n,double NULL ) {
	return Math.cos(n);
}









}
	


	



