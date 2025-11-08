package ex;

import java.util.Scanner;

public class Ex10 {
    public static  int [] gerar(int a, int b){
        int [] arrR = {a, b};

        return arrR;
        
    }
    public static void printArr(int arr[]){
        for(int i = arr[0]; i <= arr[1]; i++){
            System.out.println(i);
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero ");
        int nu1 = sc.nextInt();

        System.out.println("Entre com o seguno numero");
        int nu2 = sc.nextInt();

        int[] arr = gerar(nu1, nu2);

        printArr(arr);
    }
}
