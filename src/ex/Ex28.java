package ex;

import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        int qtdCd;
        double media = 0, vall =0, soma =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de cds");
        qtdCd = sc.nextInt();

        for(int i = 0; i < qtdCd; i ++){
            System.out.println("Entre com o valor do " + (i + 1) + " cd");
            vall = sc.nextDouble();
            soma = soma + vall;
        }

        media = soma/qtdCd;

        System.out.println("A media dos valores dos cds " + media);

        System.out.println("O valor total de todos cd e de " + soma);
    }
}
