package ex;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String resposta = "sim";
      
        while(!(resposta.equals("nao"))){
            System.out.println("Entre com o numero a ser cauculado");
            int num = sc.nextInt();
            while (num > 16 || num < 0) {
                System.out.println("Invalido");
                System.out.println("Entre com o numero a ser cauculado");
                num = sc.nextInt();
            }
            for(int i = num -1; i>0; i--){
                num = num * i; 
            }

            System.out.println("Fatorial: " +num);
               
        }

    }
}
