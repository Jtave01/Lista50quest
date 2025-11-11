package ex;

import java.util.Scanner;

class Ex25 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String parar = "nao";
        double media = 0;
        int count = 0;
        int sum =0;
        while (parar.equalsIgnoreCase("nao")) {
            
            System.out.println("Dgite sua idade ");
            int idade = sc.nextInt();
            sum = sum + idade;

            count++;

            System.out.println("Deseja parar o programa ?");
            parar = sc.next();

        }
        media = sum/count;

        if(media >=  0 && media <= 25){
            System.out.println("Turma jovem");
        }
        else if(media >= 26 && media < 60  ){
            System.out.println("Turma adulta");
        }else{
            System.out.println("Turma idosa");
            
        }



        System.out.println("Media da idade da turma " + media);
        sc.close();
    }
    
}