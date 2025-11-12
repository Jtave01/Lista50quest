package ex;

import java.util.Scanner;

public class Ex38 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o salario inicial ");
        double sal = sc.nextDouble();
        
        double percente = 1.5/100.0;
        sal = sal + (sal * percente);

        for(int i = 1995; i < 2025; i++){
            percente = percente * 2;
        }
        sal = sal + (sal * percente);
        
        System.out.println("Salalrio atual " + sal);
    }
}
