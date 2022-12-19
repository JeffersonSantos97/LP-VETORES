package Vetores;

import java.util.Scanner;

public class Exer_027 {

    public static void main(String[] args ) {

        Scanner sc = new Scanner ( System.in);

        String[] vetorA = new String[10];
        String[] vetorB = new String[vetorA.length];


        // pegar elementos do vetor A

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print("Entre com o " + ( i + 1 ) + " numero: ");
            vetorA[i] = sc.next();

            // Logica do vetorB


            // Integer.ParseInt(vetorA menor que 7 ==> A
            if(Integer.parseInt(vetorA[i]) <  7) {

                vetorB[i] = "A";
            }
            // Integer.ParseInt(vetorA igual a 7 ==> B
            else if(Integer.parseInt(vetorA[i]) == 7 ) {

                vetorB[i] = "B";
            }
            // Integer.ParseInt(vetorA maior que 7 == > C
            else if(Integer.parseInt(vetorA[i]) > 7 && Integer.parseInt(vetorA[i]) < 10 ) {

             vetorB[i] = "C";
            } else {

                vetorB[i] = "E";
            }
        }

        // printar o vetor A

        System.out.print("Vetor A = ");

        for ( int i = 0 ; i < vetorA.length ; i++ ) {

            System.out.print(i + " ");
        }

        System.out.println(); // pular uma linha
        // printar o vetor B

        System.out.print("Vetor B = ");

        for ( String i : vetorB ) {

            System.out.print(i + " ");
        }







        sc.close();
    }



}
