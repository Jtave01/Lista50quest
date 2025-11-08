package  ex;

import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        int noAnterior = 0;
        int noAtual = 1;
        int noResposta = 0;

    
        while (noResposta < 500) {
            noResposta = noAnterior + noAtual;

            System.out.printf("[%d]", noResposta);

            noAnterior = noAtual;

            noAtual = noResposta;
        }
    
    }
}