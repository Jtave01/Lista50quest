package ex;

import java.util.Scanner;

public class Ex36 {

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero de comeco da tabuada");
        int nC = sc.nextInt();

        System.out.println("Entre com o numero de termino da tabuada");
        int nT = sc.nextInt();

        System.out.println("Entre com o numero a ser cauculado ");
        int num = sc.nextInt();


        System.out.printf("Tabuada do %d %n", num);
        System.out.printf("Comecar no %d %n", nC);
        System.out.printf("Terminar no %d %n", nT);
        for(int i = nC; i <= nT; i++){
            System.out.printf("[%d x %d = %d]%n", num, i, (num * i));
        }

        
    }
}