package ex;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contp = 0;
        int conti = 0;
        for(int i = 0; i < 10; i++){
            System.out.println("Entre com o numero ");
            int num = sc.nextInt();

            if(num % 2 == 0){
                contp++;
            }else{
                conti++;
            }

        }
        System.out.println("Quantidade de numeros impar " + conti);
        System.out.println("Quantidade de numeros pares " + contp);
    sc.close();
    }
    
}
