package ex;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        int noAnterior = 0;
        int noAtual = 1;
        int noResposta = 0;

        System.out.println("Entre com o valor de n");
        Scanner sc = new Scanner(System.in);
        int n = 0;
         n = sc.nextInt();

        while (noResposta < n) {
            noResposta = noAnterior + noAtual;

            System.out.printf("[%d]", noResposta);

            noAnterior = noAtual;

            noAtual = noResposta;
        }
    }
    
}
