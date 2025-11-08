package ex;

import java.util.Scanner;

public class Ex21 {
     static boolean primo(int n){
        if(n == 2 ){
            return true;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
            return false;
        }
        
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero a ser verificado ");
        int num = sc.nextInt();

        if(primo(num) == false){
            System.out.println("======Nao e ====");


        }else{
            System.out.println(" primo");
        }

    }
}
