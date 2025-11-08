package ex;

import java.util.Scanner;

public class Ex7 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int maior =0;

        for(int i = 0; i < 5; i ++){
            System.out.println("Digite o numero");
            int num  =sc.nextInt();
            
            if(i == 0){
                maior = num;
            }

            if(num > maior){
                maior = num;
            }
        }
        
        System.out.println("O maior numero e: " + maior);
    
    }
}
