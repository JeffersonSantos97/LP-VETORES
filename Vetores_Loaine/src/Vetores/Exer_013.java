package Vetores;
import java.util.Scanner;
public class Exer_013 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner ( System.in);

        int somaMultiplo = 0;  // variavel soma do multiplos de 5

        int[] vetorA = new int[10];




        // pegar os elementos do vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1) + " numero: ");
            vetorA[i] = sc.nextInt();
        }

        // somando os elementos multiplos de 5
        for ( int i = 0 ; i < vetorA.length; i++ ) {

            if( vetorA[i] % 5 == 0 ) {

                somaMultiplo += vetorA[i];


            }

        }

        // printar os vetores numeros digitados

        System.out.print("Numeros = " );

        for ( int i : vetorA ) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        // printar os multiplos


        // printar a soma

        System.out.println("Soma dos multiplos = " + somaMultiplo);


        sc.close();
    }
}
