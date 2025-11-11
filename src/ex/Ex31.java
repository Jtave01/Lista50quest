package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex31 {
    public static void main(String []args){
        List<Double> precos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;
        double preco = -1, total;
        while (preco !=0) {
            
            System.out.println("Entre com o preco do produto ou digite 0 para sair"); 
            preco = sc.nextDouble();
            precos.add(preco);
        }
        double soma = 0.0;
        for(double d: precos){
            soma = soma + d;
        }

        System.out.print("Total do dinheiro passado ao caixa ?");
        double totalNota = sc.nextDouble();
        
        
        double troco = soma - totalNota;
        
        int auxCont = 1;

        if(!(precos.isEmpty())){
            for(Double d: precos){
                
                if(d != 0){
                    System.out.printf("Produto %d: R$ %.2f %n", auxCont, d);
                }
                      auxCont++;
            
             }
             System.out.printf("Total: %.2f%n", soma);
             System.out.printf("Troco: %.2f%n ", troco);
        }
        

    }
}
