package ex;

import java.util.Scanner;

public class Ex39 {

   

    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int n =10;
        int [] aluno = new int[n];
        double [] altura = new double[n];


        for(int i = 0; i < aluno.length; i++){
            System.out.println("Entre com o numero do aluno ");
            int num = sc.nextInt();
            System.out.println("Entre com a altura do aluno");
            double alt = sc.nextDouble();

            aluno[i] = num;
            altura[i] = alt;


            
        }

        int alMl = 0, almb =0;
        double a = 0.0, b =0.0;

        for(int i = 0; i < n; i++ ){
            if (i == 0) {
                alMl = aluno[i];
                almb = aluno[i];
                a = altura[i];
                b = altura[i];
            }

            if(altura[i]  > a){
                a = altura[i];
                alMl = aluno[i];
            }else if(altura[i] < b){
                b = altura[i];
                almb = aluno[i];
            }
        }
          
        System.out.printf("O aluno mais alto e o %d, e a altura dele e %.2f %n", alMl,a );
        System.out.printf("O aluno mais baixo e o %d, e a altura dele e %.2f %n", almb ,b );
       
    }
}
