package ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String resposta ="nao";
        Map<Integer, Double> pedidos  = new HashMap<>();;

        Map<Integer, Double> cardapio = Map.of(
            100, 1.20,
            101, 1.30,
            102, 1.50,
            103, 1.20,
            104, 1.30, 
            105, 1.00
        );

        double soma = 0.0;
        
     
        while (resposta.equalsIgnoreCase("nao")) {
            
            System.out.println("Deseja adicionar qual pedido");
            int pedido = sc.nextInt();
            System.out.println("Qual a quantidade ?");
            int quantidade = sc.nextInt();
    
            soma = soma + cardapio.get(pedido ) * quantidade;
            pedidos.put(pedido, (cardapio.get(pedido) * quantidade));


            System.out.println("Dejesa parar de adicionar pedidos ");
            resposta = sc.next();

        }

        for(Map.Entry<Integer, Double> pd: pedidos.entrySet()){
            System.out.printf("Pedido: %d   - - - Valor total %.2f %n", pd.getKey(), pd.getValue());
        }

        System.out.println("A soma total e " + soma);
    }
}
