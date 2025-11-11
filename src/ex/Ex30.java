package ex;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entre com o preco do pao");
        double prc = sc.nextDouble();

        System.out.printf("Preco do pao [%.2f]%n", prc);

        for(int i = 1; i <= 50; i++){

            System.out.printf("[%d] - R$ [%.2f]%n", i, (prc * i));
        }
    }
}
