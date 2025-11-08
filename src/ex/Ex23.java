package ex;

import java.util.Scanner;
//23
public class Ex23 {
    private static String retorno;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero");
        int n = sc.nextInt();

        int count =1;
        for(int i =2; i < n; i++){
            if(n % i == 0){
                retorno = "Nao e primo";
                break;
            }else{
                retorno = "e primo";
                
            }
            count++;
        }
        
        
        System.out.println(retorno);
        System.out.println("Numero de tentativas " + count);
                
    }
}
