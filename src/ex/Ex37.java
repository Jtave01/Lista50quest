package ex;

import java.util.Scanner;

public class Ex37 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        double maisA = 0, maisG = 0, menosA =0, menosG = 0, somaP =0, somaA = 0;

        int sair = -1, cont = 0;

        
        while (sair != 0) {
            System.out.println("Entre com o peso do cliente ");
            double peso = sc.nextDouble();
            System.out.println("Entre com a altura do cliente ");
            double altura = sc.nextDouble();

            somaP = somaP + peso;
            somaA = somaA + altura;

            if(cont == 0){
                menosA = altura;
                menosG = peso;
                maisA = altura;
                maisG = altura;
            }

            if(peso > maisG){
                maisG = peso;
            }else if(peso < menosG){
                menosG = peso;
            }

            if(altura > maisA){
                maisA = altura;
            }else if(altura < menosA){
                menosA = altura;
            }
            
            cont++;

            System.out.println("Deseja adicionar mais ?");
            sair = sc.nextInt();
        }
       
      double mediaA = somaA/cont;
      double mediaP = somaP/cont;
      
      System.out.println("A media das alturas e " + mediaA);
      System.out.println("A media dos pesos e " + mediaP);
      System.out.println("O cliente mais gordo e "  + maisG);
      System.out.println("O cliente mais magro e "  + menosG);
      System.out.println("O cliente mais alto e "  + maisA);
      System.out.println("O cliente mais baixo e "  + menosA);
      
        
    }
}
