package ex;

import java.util.Scanner;

public class Ex51 {

    public static void main(String[] args) {
        double dividendo = 1.0;
        double divisor = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o delimitador da sequencia ");
        int n = sc.nextInt();

        System.out.printf("S = ");
        double soma = 0.0;
        for(int i = 1; i <= n; i++){
            System.out.printf("%.0f/%.0f  + ", dividendo,divisor);
            soma = soma + (dividendo/divisor);
            dividendo++;
            divisor = divisor + 2;
        }

        System.out.println("a soma e " + soma);
    }
    
}
