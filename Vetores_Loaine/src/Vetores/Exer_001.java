package Vetores;
import java.util.Scanner;
public class Exer_001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in );
		
		/* Criar um array */ 
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length]; // o array é do tamanho do array do A
		
		// inteirar um array ( colocar o dados dentro do array ) 
		
		for(int i = 0 ; i < vetorA.length; i++ ) { 
			
			System.out.println("Entre com a posição " + i );
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i];
		}
		
		
		// exibir na tela um array 
		
		System.out.print("VETOR A = ");
		// exibir um vetor A
		for ( int i =0 ; i < vetorA.length; i++ ) { 
			
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println(); // pular uma linha 
		
		System.out.print("VETOR B = ");
		// exibir o Vetor B
		for ( int i = 0; i < vetorB.length; i++) { 
			
			System.out.print(vetorB[i] + " ");
		}
		
		sc.close();
		
	}

}
