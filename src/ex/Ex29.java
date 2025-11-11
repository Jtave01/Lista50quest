package ex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex29 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
    
        double vall = 1.99;
        System.out.println("Loja quase dois - Tabela de precos");

        for(int i =1; i <=50; i++){
            
            System.out.printf("[%d] - R$ [%.2f]%n", i, (vall * i));
        }
    
  }
}
