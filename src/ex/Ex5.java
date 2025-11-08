package ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String []args){

        int hbA = 0;
        int hdB = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de habitantes da cidade a ");
        hbA = sc.nextInt();
        System.out.println("Entre com a quantidade de habitantes da cidade b ");
        hdB = sc.nextInt();

        double crescB = 0.0;  
        double crescA = 0.0;

        System.out.println("Entre com o percentual decrescimento da cidade b em porcentagem");
        String param = sc.next();

        System.out.println("Entre com o percentual decrescimento da cidade b em porcentagem");
        String param2 = sc.next();


        crescB =(Double.parseDouble(param)/100.0);
        crescA =(Double.parseDouble(param2)/100.0);


        int ano = 0;
        double k = hdB;
            
        for(double i  = hbA; i < k; i = i + (i *crescA)){
                k = k +(k * crescB );
                ano++;
            }
        

        System.out.println(" Anos: " + ano);
    }
}
