package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex46 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Atleta: ");
            String nome = sc.nextLine().trim();

            
            if (nome.isEmpty()) {
                break;
            }

            List<Double> saltos = new ArrayList<>();

          
            System.out.print("Primeiro Salto: ");
            saltos.add(Double.parseDouble(sc.nextLine()));

            System.out.print("Segundo Salto: ");
            saltos.add(Double.parseDouble(sc.nextLine()));

            System.out.print("Terceiro Salto: ");
            saltos.add(Double.parseDouble(sc.nextLine()));

            System.out.print("Quarto Salto: ");
            saltos.add(Double.parseDouble(sc.nextLine()));

            System.out.print("Quinto Salto: ");
            saltos.add(Double.parseDouble(sc.nextLine()));

            
            double melhor = saltos.get(0);
            double pior = saltos.get(0);

            for (double s : saltos) {
                if (s > melhor) melhor = s;
                if (s < pior) pior = s;
            }

           
            double soma = 0;
            for (double s : saltos) soma += s;

            double media = (soma - melhor - pior) / 3.0;

         
            System.out.println();
            System.out.println("Atleta: " + nome + "\n");

            System.out.println("Primeiro Salto: " + saltos.get(0) + " m");
            System.out.println("Segundo Salto: " + saltos.get(1) + " m");
            System.out.println("Terceiro Salto: " + saltos.get(2) + " m");
            System.out.println("Quarto Salto: " + saltos.get(3) + " m");
            System.out.println("Quinto Salto: " + saltos.get(4) + " m\n");

            System.out.println("Melhor salto: " + melhor + " m");
            System.out.println("Pior salto: " + pior + " m");
            System.out.printf("Média dos demais saltos: %.1f m%n%n", media);

            System.out.println("Resultado final:");
            System.out.printf("%s: %.1f m%n%n", nome, media);
        }

        
    }
}
