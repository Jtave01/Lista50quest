package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex47 {
    static void troca(double []arr, int i, int menorIndex ){
        double aux = arr[i];
        arr[i] = arr[menorIndex];
        
        arr[menorIndex] = aux;
    }

    static double[] sort(double [] arr){
        for(int i = 0; i < arr.length; i++){
            int menorIndex = i;

            for(int k = i + 1; k < arr.length; k++){

                if(arr[k] < arr[menorIndex]){
                    menorIndex = k;
                }
            }

            troca(arr, i, menorIndex );
        }

        return arr;
    }

    public static void main (String[]args ){
        double [] notas = new double[7];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do atleta ");
        String nomeAtleta = sc.next();
        sc.nextLine();

        for(int i = 0; i < 7; i++){
            System.out.printf("Dgite a %d nota",(i+1));
            double nota = sc.nextDouble();

            notas[i] = nota;
        }

        sort(notas);
        System.out.println("Nome do atleta " + nomeAtleta);
        double soma = 0.0;
        for(int i = 0; i < notas.length; i++){

            if( i != 0 || i != (notas.length - 1) ){
                soma = soma + notas[i];
            }
            System.out.printf("NOTA: %.2f\n ", notas[i]);
        }

        double media = soma/5.0;

        System.out.printf("A pior nota e %.2f\n ", notas[0]);
        System.out.printf("A melhor nota e %.2f\n ", notas[ notas.length -1]);


        
    }
    
}
