package ex;

import java.util.Map;
import java.util.Scanner;

public class Ex45 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        Map<Integer, Character> gabarito = Map.of(
            1, 'a',
            2, 'b',
            3, 'c',
            4, 'd',
            5, 'e',
            6, 'e',
            7, 'd',
            8, 'c',
            9, 'b',
            10, 'a'
        );

        String alunoMaiorAcerto =" ", alunoMenorAcerto = " ";

        int cont =0, qtdMaiorAc =0, qtdMenorAc =0, somaTotalNotas =0;

        String resposta = "sim";


        while (resposta.equals("sim")) {
            System.out.println("Entre com o nome do aluno");
            String nome = sc.next();
            int acertos =0;

            for(int i = 1; i <=10; i ++){    
                System.out.printf("Digite a resposta da %d\n ", i);
                char questaoResposta = sc.next().charAt(0);
                
                if(questaoResposta == gabarito.get(i)){
                    acertos++;
                }
                
            }
            somaTotalNotas = somaTotalNotas + acertos;
            if(cont == 0){
                qtdMaiorAc = acertos;
                qtdMenorAc = acertos;
                alunoMaiorAcerto = nome;
                alunoMenorAcerto = nome;
            }

            if(acertos > qtdMaiorAc){
                qtdMaiorAc = acertos;
                alunoMaiorAcerto = nome;
            } 
            if(acertos < qtdMenorAc){
                qtdMenorAc = acertos;
                alunoMenorAcerto = nome;
            }
            cont++;

            System.out.println("Mais um aluno deseja utiliza o sistema ?");
            resposta = sc.next();

        }

        System.out.printf("A maior nota e %d e pertence ao aluno %s %n ", qtdMaiorAc, alunoMaiorAcerto);
        System.out.printf("A menor nota e %d e pertence ao aluno %s %n ", qtdMenorAc, alunoMenorAcerto);

        double media = somaTotalNotas/cont;
        System.out.printf("A media da turma e %.2f\n", media);
        System.out.printf("A quantidade de alunos da turma e %d\n", cont);
    
    }
}