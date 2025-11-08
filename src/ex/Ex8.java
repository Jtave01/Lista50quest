package ex;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        for(int i = 0; i < 5; i ++){
            System.out.println("Digite o numero");
            int num  =sc.nextInt();
            soma = soma + num;


        }

        System.out.println("A soma dos numeros e: " + soma);
        double media = soma/5.0;

        System.out.println("A media e: " + media);

        sc.close();
    }
    
}
