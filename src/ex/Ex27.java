package ex;

import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com a quantidade de salas ");
        int qtdSala = sc.nextInt();
    
        
        int [ ] alunos = new int[qtdSala];
        
        int soma = 0;

        for(int i = 0; i <qtdSala; i++){
            System.out.println("Entre com a quantidade de alunos da " +  ( i + 1) + " sala");
            int a = sc.nextInt();
            while (a > 40) {
                System.out.println("Invalido");
                System.out.println("Entre com a quantidade de alunos da " +  ( i + 1) + " sala");
                a = sc.nextInt();
            }
            soma = soma + a;

        }

        System.out.println("A media de alunos por sala e " + (soma/qtdSala));
    }
}
