package Vetores;

import java.util.Scanner;

public class Exer_015 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner(System.in);

        int[] vetorA = new int[10];



        // pegar os elementos

        for( int i = 0 ; i < vetorA.length ; i ++ ) {

            System.out.println("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.nextInt();
        }


        // par ou impar

        int impar = 0;

        for( int i = 0 ; i < vetorA.length; i++ ) {

            if(vetorA[i] % 2 == 0 ) {

                impar++;
            }
        }
        int par = vetorA.length - impar;

        // vetorA.length         100%
        //     par                x

        // vetorA.length * x = par * 100

        // x = ( par * 100 ) / vetorA.length





        double percImpar = (impar * 100) / 10;

        double percPar = (par * 100 ) / 10;

        // printar os numeros

        System.out.print("Numeros " );

        for ( int i : vetorA) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha

        System.out.println("Percentual Par = " + percPar + "%");
        System.out.println("Percentual Impar = " + percImpar + "%");








        sc.close();
    }



}
