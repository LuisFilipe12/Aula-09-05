import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner lf = new Scanner(System.in);
		
		
		Produto produto = new Produto();
		System.out.println("Entre com um n�mero: ");
		double n1 = lf.nextDouble();
		System.out.println("Entre com outro n�mero: ");
		double n2 = lf.nextDouble();
		
		System.out.println("Resultado � :" + produto.Calcular(n1, n2));
		
		
		
		
		lf.close();
		
	}

}
