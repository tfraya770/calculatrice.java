package projet_1;

public class Addition extends OperationBinaire implements CalculMath
{
public Addition(double x,double y){
	
	super(x,y);
}
@Override
public double Calculer(double x, double y) {
		return x+y;
	}
@Override
public void result() {
	System.out.println("le resultat est : "+Calculer(x,y));
};

}


