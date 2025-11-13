package ex;

import java.util.Scanner;

public class Ex40 {
    public static void main(String []args){
        int n = 3;
        Scanner sc = new Scanner(System.in);
        String[] cidade = new String[n];
        int[] cod = new int[n];
        int[] numVecP = new int[n];
        int[] numAcd = new int[n];
        int somaV =0;
        int soma2000 =0;

        for(int i =0; i < n; i++){
            System.out.println("Entre com o nome da cidade");
            String nome = sc.next();
            System.out.println("Entre com o codigo dessa cidade");
            int cd = sc.nextInt();
            System.out.println("Entre com o numero de veiculos de passeio dessa cidade");
            int numV = sc.nextInt();
            System.out.println("Entre com o numero de acidentes de transito");
            int numAd = sc.nextInt();

            cidade[i] = nome;
            cod[i] = cd;
            numVecP[i] = numV;
            numAcd[i] = numAd;

            somaV = somaV + numV;
            if(numV < 2000){
                soma2000 = soma2000 + numV;
            }
        }   
        int maiorIndex =0 , menorIndex =0;
        String cdIndex = "";
         String cdIndexM = "";

        for(int i = 0; i < n; i++){
            if(i == 0){
                 maiorIndex = numAcd[i]; 
                 menorIndex = numAcd[i];
                 cdIndex = cidade[i];
                 cdIndexM = cidade[i];
            }
            

            if(numAcd[i] > maiorIndex){
                 maiorIndex = numAcd[i]; 
                 cdIndexM = cidade[i];              
            }else if(numAcd[i] < menorIndex){
                menorIndex = numAcd[i];
                 cdIndex = cidade[i];
            }
        }

        System.out.printf("O menor index de acidente de transito e %d e pertence a cidade %s %n", menorIndex, cdIndex);
        System.out.printf("O maior index de acidente de transito e %d e pertence a cidade %s %n", maiorIndex, cdIndexM);

        double media = somaV/n;
        double media2 = soma2000/n;

        System.out.println("Amedia de veiculos das 5 cidades e " + media);
        System.out.println("A media de veiculos da cidade com menos de 2000 veiculos e " + media2);

    }
    
    
}
