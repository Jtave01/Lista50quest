package ex;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Entre com o numero a ser cauculado");
      int num = sc.nextInt();
      
      System.out.printf("%d ! = %d * ", num, num);
      
      int fatorial = num;
      
      for(int i = num -1 ; i > 0; i --){
            fatorial = (fatorial * i); 
            System.out.printf(" %d * ", i);
      
        }

       System.out.printf(" %d ", fatorial);
       
      

      sc.close();
    }
}
