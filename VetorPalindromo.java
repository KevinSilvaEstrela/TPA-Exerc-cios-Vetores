import java.util.Scanner;
public class VetorPalindromo {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			final int TAM = 10;
			  int i, x;
			  boolean check;
			  int a[];
			  a = new int[TAM];
			  
			  x = (TAM-1);
			  
			  for (i=0; i<TAM; i++) {
				  System.out.println("Digite o "+(i+1)+" valor de A");
				  a[i] = in.nextInt();
			  }
			  
			  i = 0;
			  check = true;
			  while((i < x) && (check == true)) {
				  
				  if(a[i] != a[x]) {
					  check = false;
					  
				  } else {
					  i++;
					  x--;
				  }
				  
			  }
			  
			  if(check == true) {
				  System.out.println("\n Os elementos dentro do Vetor A formam um pal�ndromo \n");
			  } else {
				  System.out.println("\n Os elementos dentro do Vetor A n�o formam um palindromo \n");
			  }
		}
	      
	}
}
	    
/** 9.	N�meros pal�ndromos s�o aqueles que escritos da direita para a esquerda
 *  t�m o mesmo valor quando escritos da esquerda para a direita. 
 *  Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que verifique
 *  se um dado vetor A de 10 elementos inteiros � um pal�ndromo, ou seja, 
 *  se o primeiro elemento do vetor e igual ao �ltimo, se o segundo elemento do 
 *  vetor � igual ao pen�ltimo e assim por diante at� verificar todos os elementos 
 *  ou chegar a conclus�o que o vetor n�o � um pal�ndromo.	
* 
*/
	


	
		
	

