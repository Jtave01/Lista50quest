package ex;

import java.util.Scanner;

public class Ex18 {
    private static final Scanner sc = new Scanner(System.in);
    
    static int[] gerar(int n){

        int [] arr = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("Entre com o numero a adicionar ");
            arr[i] = sc.nextInt();
        }
        
        return arr;
    }
    static void sort(int []arr){
        for(int i = 0; i <arr.length; i++){

            int menorIndex = i;

            for(int k = i+ 1; k < arr.length; k ++){

                if(arr[k] < arr[menorIndex]){
                    menorIndex = k;
                }
            }
            troca(arr, menorIndex, i);
        }

    }

    static void troca(int arr[], int menorIndex, int i){
        int aux = arr[i];

        arr[i] = arr[menorIndex];

        arr[menorIndex] = aux;
    }

    static int soma (int arr[]){
        int soma =0;

        for(int i =0; i< arr.length; i++){
            soma += arr[i];
        }
        return soma;
    }
    public static void main(String[] args) {
        
        System.out.println("Quantos numeros deseja adicionar no array?");
        int n = sc.nextInt();

        int [] arr = gerar(n);

        sort(arr);

        System.out.println("O menor numero e o " + arr[0]);

        System.out.println("O maior numero e " + (arr[arr.length -1]));

        System.out.println("A soma dos numeros e " + soma(arr));
    }
}
