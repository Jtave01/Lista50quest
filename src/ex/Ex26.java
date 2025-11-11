package ex;
import java.util.Scanner;

class Ex26{

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String [ ] candidatos = new String[3];
        
        for(int i = 0; i < 3; i++){
            System.out.println("Entre com o nome do " + (i + 1) + " candidato");
            String c = sc.next();
            sc.nextLine();
            candidatos[i] = c;
        }

        System.out.println("Entre com o numero total de eleitores ");
        int numEleitores = sc.nextInt();

        int [] voutes = new int[3];
        for(int i = 0; i < numEleitores; i++){
            System.out.println("===Urna===");
            
            System.out.println("Para qume voce deseja vota, para candidato: " + (candidatos[0]) + " aperte 1 " + 
            " para o candidato " + (candidatos[1]) + " aperte o 2" + " para o candidato " + (candidatos[2]) + " aerte o 3"
            );

            int voto = sc.nextInt();

            switch (voto) {
                case 1:{
                    voutes[0] = voutes[0] + 1;
                     break;
                }
                case 2: {
                    voutes[1] = voutes[1] + 1;
                     break;
                }
                case 3: {
                    voutes[2] = voutes[2] + 1;
                     break;
                }
                default:
                    break;
            }

        }

        for(int i = 0; i < voutes.length; i ++){
            System.out.println("O numero de voto do " + candidatos[i] + " = " + voutes[i]);
        }

    }
}