package ex;

import java.util.Scanner;

public class Ex24{
    public static void main(String[] args) {
        int loop = 0;
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media;
        int count =0;
        while ( loop ==0) {
            System.out.println("Adicione a nota do aluno");
            double nota = sc.nextDouble();

            soma = soma + nota;
            count++;

            System.out.println("Deseja adicionar mais uma nota ?");
            String resposta = sc.next();
            if(resposta.equals("nao")){
                loop = -1;
            }
        } 
        media = soma/count;
        System.out.println("A media das nota e " + media);
    }
}