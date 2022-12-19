package Vetores;

import java.util.Scanner;

public class Exer_020 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.print("Entre com a cotacao: ");
        cotacao = sc.nextDouble();

        for (int i = 0; i < vetorA.length; i++) {


            vetorA[i] = cotacao * (i + 1);


        }

        // printar o vetor A

        System.out.print("Vetor A = ");

        for (double i : vetorA) {

            System.out.print( i + " ");
        }


        sc.close();
    }

}
