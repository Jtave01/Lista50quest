package ex;

import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor da divida ");
        double valDivida = sc.nextDouble();

        double juros = 0.0;
        
        int aux =0;
        for(int i = 1; i <= 12; i = aux * 3){
            switch (i) {
            case 1:{
                juros = 0.0;
                break;
            }
            case 3:{
                juros = (10.0/100.0);
                break;
            }
            case 6:{
                juros = (15.0/100.0);
                break;
            }
            case 9: {
                juros = (20.0/100.0);
                break;
            }    
            case 12: {
                juros = (25.0/100.0);
                break;
            }    
            default:
            juros = 0.0;
                break;

        }
      
            double valTotal = (valDivida + (valDivida * juros));

            System.out.printf("Valor da divida: %.2f  Valor do juros: %.2f Quantidade de parcelas: %d  Val parcela : %.2f %n",  valTotal, (juros * 100.00 ), i,(valTotal/i) );
            aux++;
        }

    }
}
