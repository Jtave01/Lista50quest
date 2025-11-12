package ex;

import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);

        float menor =0F, maior = 0F, temp = 0F, soma = 0F;

        String resposta  = "nao";

        int count = 0;
        while (resposta.equalsIgnoreCase("nao")) {
            System.out.println("Digite a temperatura");
            temp = sc.nextFloat();

            soma = soma + temp;

            if(count == 1 ){
                menor = temp;
                maior = temp;
            }

            if(temp > maior){
                maior = temp;
            }

            if(temp < menor ){
                menor = temp;
            }
            count++;
            System.out.println("deseja parar ?");
            resposta = sc.next();
            sc.nextLine();
        }
        float media = (soma/count);

        System.out.println("A media das temperatuaras " + media);
        System.out.println("A maior temperatura e " + maior);
        System.out.println("A menor temperatura e " + menor);
        
    }   
}
