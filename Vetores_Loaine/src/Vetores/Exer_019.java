package Vetores;

import java.util.Scanner;

public class Exer_019 {

    public static void main(String[] args ) {


        Scanner sc = new Scanner( System.in);


        double[] notas1 = new double[3];
        double[] notas2 = new double[notas1.length];
        double[] medias = new double[notas1.length];


        // pegar as duas notas de 10 alunos
        for ( int i = 0 ; i < notas1.length ; i++ ) {

            System.out.print("Entre com a primeira nota aluno " + ( i + 1) + ": ");
            notas1[i] = sc.nextDouble(); // armazenar as primeiras  notas nos vetore de notas

            System.out.println("Entre com a segunda nota aluno " + (i + 1) + ": "); // armazenar as segundas notas no vetor notas
            notas2[i] = sc.nextDouble();

            // Media
            medias[i] = (notas1[i] + notas2[i]) / 2;

        }


         // printar notas 1
        System.out.print("Notas 1 = ");
        for ( double i : notas1 ) {

            System.out.print( i + " ");
        }

        System.out.println(); // pular uma linha
        // printar notas 2

        System.out.print("Notas 2 = ");
        for ( double i : notas2) {

            System.out.print( i + " ");
        }
        System.out.println(); // pular uma linha
        // printar resultados

        for ( int i = 0 ; i <  notas1.length; i++ ) {

            if(medias[i] >= 7 ) {

                System.out.println( ( i + 1 ) + " - Aprovado");
            } else {

                System.out.println(( i + 1 ) + " - Reprevado");
            }
        }













        sc.close();
    }



}
