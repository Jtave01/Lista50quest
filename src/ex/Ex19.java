package ex;

import java.util.Scanner;

public class Ex19 {
    static boolean primo(int n){
        if(n == 2 ){
            return true;
        }
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
            return false;
        }
        return true;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero");
        int n = sc.nextInt();

        if(primo(n)== true){
            System.out.println("E primo");
        }else{
            System.out.println("Nao e primo");
        }
    }
}
