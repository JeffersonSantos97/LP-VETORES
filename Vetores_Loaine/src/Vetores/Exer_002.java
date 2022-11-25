package Vetores;

import java.util.Scanner;

public class Exer_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vetorA = new int[8]; // instanciei o array e defini o tamanho
		int[] vetorB = new int[vetorA.length]; // instanciei o array e definir o tamanho igual o do A
		//                                        assim sempre que trocar o A, automaticamente troca o B 

		// Loop pra pegar o valores de cada posição do array 
		for (int i = 0; i < vetorA.length; i++) {

			System.out.print("Entre com o " + (i + 1) + " numero: ");
			vetorA[i] = sc.nextInt();

			vetorB[i] = vetorA[i] * 2; // cada elemento do vetor B é o ( elemento do vetorA * 2 )

		}
		
		// Loop pra printar o vetor A
		System.out.print("Vetor A = ");
		
		for ( int i = 0 ; i < vetorA.length; i++ ) { 
			
			System.out.print(vetorA[i] + " ");
		}
		
		// Loop pra printar o vetor B
		
		System.out.print("Vetor B = ");
		
		for ( int i = 0 ; i < vetorA.length ; i++ ) { 
			
			System.out.print( vetorB[i]+ " ");
		}
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
