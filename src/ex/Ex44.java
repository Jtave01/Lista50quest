package ex;

import java.util.Scanner;

public class Ex44 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        int votos = -1;
        int cont1 = 0, cont2 = 0, cont3 =0, cont4 =0, contNul = 0, contBrc = 0;
        int soma =0;
        System.out.println("==========URNA==========");
        while (votos != 0) {
            System.out.println("Candidados");
            System.out.println("1 - Joao");
            System.out.println("2 - Pedro");
            System.out.println("3 - Marcos");
            System.out.println("4 - Gabriel");
            System.out.println("5 - Banco");
            System.out.println("6 - Nulo");
            System.out.println("0 - Sair");
            
            votos = sc.nextInt();
           
            if (votos ==0) {
                break;
            }
             soma ++;

            switch (votos) {
                case 1:{
                    cont1++;
                    break;
            
                }
                case 2:{
                    cont2++;
                    break;
                }
                case 3:{
                    cont3++;
                    break;
                }
                 case 4:{
                    cont4++;
                    break;
                 }
                 case 5:{
                    contBrc++;
                    break;
                 }
                 case 6:{
                    contNul++;
                    break;
                 }
                default :
                    
                    break;
            }
           
        }
        System.out.println("Votos do candidado joao " + cont1);
        System.out.println("Votos do candidado pedro " + cont2);
        System.out.println("Votos do candidado marcos " + cont3);
        System.out.println("Votos do candidado gaabriel " + cont4);
        System.out.println("Votos nulo " + contNul);
        System.out.println("Votos brancos " + contBrc);

        double percentNul = (contNul * 100.00) / soma;
        System.out.println("Percentual de votos nulos " + percentNul + " %" );
        double percentbrnc = (contBrc * 100.00) / soma;
        System.out.println("Percentual de votos nulos " + percentbrnc + " %" );
        
    }
    
}
