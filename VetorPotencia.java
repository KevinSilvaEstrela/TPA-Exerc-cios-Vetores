import java.lang.Math;
import java.util.Scanner;
public class VetorPotencia {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
		}
		final int TAM = 11;
		int i; 
		double a[];
		a = new double [TAM];
		
		for(i=0; i<TAM; i++) {
			a[i] = Math.pow(2,i);
			
		}	
		System.out.print("A[] = ");
		for(i=0;i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
	}

}

/**4.	Criar um vetor A com 11 elementos, indexados de 0 at� 10. Sendo que cada elemento do vetor A
 *  � formado pela pot�ncia de base 2 elevado ao 
 * expoente igual a posi��o do respectivo elemento, ou seja:
 */