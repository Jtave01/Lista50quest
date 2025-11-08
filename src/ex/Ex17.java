package ex;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Entre com o numero a ser cauculado");
        int num = sc.nextInt();
    
        for(int i = num -1; i>0; i--){
            num = num * i; 
        }

        System.out.println("Fatorial: " +num);
    }
}
