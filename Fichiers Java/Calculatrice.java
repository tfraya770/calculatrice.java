package projet_1;
import java.util.Scanner;

public class Calculatrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		boolean exit = false;
		
		while (!exit) {
		System.out.println("Bienvenue dans la calculatrice !");
		System.out.println("Choisissez une opération : ");
		System.out.println("1. Addition (+)");
		System.out.println("2. Soustraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");
		System.out.println("5. Cosinus (cos)");
		System.out.println("6. Sinus (sin)");
		System.out.println("7. Logarithme (log)");
		System.out.println("8. Exponentielle (exp)");
		System.out.println("9. Racine carrée (sqrt)");
		System.out.print("Entrez le numéro de l'opération : ");
		int choix = scanner.nextInt();
		switch (choix) {
		case 1:
			System.out.print("Entrez le premier nombre : ");
			double a = scanner.nextDouble();
			System.out.print("Entrez le deuxième nombre : ");
			double b = scanner.nextDouble();
			Addition addition = new Addition(a, b);
			addition.result();
			
			break;
		case 2 :
			System.out.print("Entrez le premier nombre : ");
			a = scanner.nextDouble();
			System.out.print("Entrez le deuxième nombre : ");
			b= scanner.nextDouble();
			Soustraction soustraction = new Soustraction(a, b);
			soustraction.result();
			break;
		case 3:
			System.out.print("Entrez le premier nombre : ");
			a = scanner.nextDouble();
			System.out.print("Entrez le deuxième nombre : ");
			b= scanner.nextDouble();
			Multiplication multiplication = new Multiplication(a, b);
			multiplication.result();
			break;
		case 4 :
			System.out.print("Entrez le premier nombre : ");
			a = scanner.nextDouble();
			System.out.print("Entrez le deuxième nombre : ");
			b= scanner.nextDouble();
			Division division = new Division(a, b);
			division.result();
			break;
		case 5 :
			System.out.print("Entrez le nombre : ");
			a = scanner.nextDouble();
			Cos cos = new Cos(a);
			cos.result();
			break;   

		case 6:
			System.out.print("Entrez le nombre : ");
			a = scanner.nextDouble();
			Sin sin = new Sin(a);
			sin.result();
			break;   
		case 7:
			
			System.out.print("Entrez le nombre : ");
			a = scanner.nextDouble();
			Log log = new Log(a);
			log.result();
			break;
			
		case 8:
			System.out.print("Entrez le nombre : ");
			a = scanner.nextDouble();
			Exp exp = new Exp(a);
			exp.result();
			break;
		case 9:
			System.out.print("Entrez le nombre : ");
			a = scanner.nextDouble();
			Sqrt sqrt = new Sqrt(a);
			sqrt.result();
			break;
			
		default:
			System.out.println("Choix invalide !");
			break;
		}
		
		
		
         System.out.println("Voulez-vous effectuer une autre opération ? (Y/N)");
         String answer = scanner.next();
         if (answer.equalsIgnoreCase("N")) {
             exit = true;
         }
            
		}
		scanner.close();


		}



	}