package ex;

import java.util.Scanner;

public class Ex50 {
    public static void main(String[] args) {
         double dividendo = 1.0;
        double divisor = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o delimitador da sequencia ");
        int n = sc.nextInt();

        System.out.printf("H = 1 + ");
        double soma = 1;
        for(int i = 1; i <= n; i++){
            System.out.printf("%.0f/%.0f + ", dividendo,divisor);
            soma = soma + (dividendo/divisor);
           
            divisor = divisor + 1;
        }
         System.out.println("O valor de H e " + soma);
    }
    
}
