package Vetores;

import java.util.Scanner;

public class Exer_004 {

	public static void main(String[] args) {
		
		
		
Scanner sc = new Scanner(System.in);

		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length]; // no exercicio vem dizendo que é o mesmo tamanho
		//                                              não o mesmo tipo. vetor A é int e o vetorB é um double
		
		
		// loop pra colocar os elementos dentro do array 
		for ( int i = 0 ; i < vetorA.length; i++) { 
			
			System.out.print("Entre com o " + (i + 1 ) + "numero: ");
			vetorA[i] = sc.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]); // raiz quadrada do vetor A
		}
		
		System.out.print("Vetor A = ");
		
		for ( int i = 0 ; i < vetorA.length; i++ ) { 
			
			System.out.print( vetorA[i] + " ");
		}
		
		System.out.println(); // pular uma linha 
		
		System.out.print("Vetor B = ");
		
		for ( int i = 0 ; i < vetorA.length; i++) { 
			
			System.out.print( vetorB[i] +" ");
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
