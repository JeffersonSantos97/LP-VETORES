package Vetores;

import java.util.Scanner;

public class Exer_003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner ( System.in );
		
		
		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		
		for ( int i = 0 ; i < vetorA.length ; i++ ) { 
			System.out.print("Entre com o " + (i + 1 ) + " numero:" );
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = vetorA[i] * vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		
		for( int i = 0 ; i < vetorA.length; i++ ) { 
			
			System.out.print( vetorA[i] + " ");
		}
		System.out.println(); // pular uma linha 
		
		System.out.print("Vetor B = ");
		
		for( int i = 0; i < vetorA.length; i++) { 
			
			System.out.print(vetorB[i] + " ");
		}
		
		
		
		
		
		
		sc.close();

	}

}
