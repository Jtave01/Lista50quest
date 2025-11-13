package ex;

import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int intervalo_0_25 = 0, intervalo_26_50 = 0, intervalo_51_75 = 0, intervalo_76_100 = 0;
        
        int num =0;

        while (num >= 0) {
           System.out.println("Entre com o numero ");
           num = sc.nextInt(); 

           if(num >=0 && num <=26){
            intervalo_0_25++;
           }else if(num >= 26 && num <= 50){
            intervalo_26_50 ++;
           }else if(num >= 51 && num <=75){
            intervalo_51_75++;
           }else if(num >= 76 && num <=100){
            intervalo_76_100++;
           }
        }

        System.out.println("A quantidade de numeros no numero em um intervalo de 0 a 26: " + intervalo_0_25);
        System.out.println("A quantidade de numeros no numero em um intervalo de 26 a 50: " + intervalo_26_50);
        System.out.println("A quantidade de numeros no numero em um intervalo de 51 a 75: " + intervalo_51_75);
    }
}