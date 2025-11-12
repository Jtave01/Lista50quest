package ex;

import java.util.Scanner;

public class Ex35 {

    static boolean ehPrimo(int n ){
        if(n == 2){
            return true;
        }

        for(int i = 2; i < Math.sqrt(n); i++){

            if(n % i == 0){
                return false;
            }
        }
        return true;

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero ");

        int num = sc.nextInt();

        if(ehPrimo(num) == true){
            System.out.printf("O  numero %d e primo %n", num);
        }else{
            System.out.printf("O  numero %d e nao primo %n", num);
        }

    }
    
}
