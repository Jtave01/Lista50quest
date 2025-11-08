package ex;
import java.util.Scanner;

public class Ex3 {
    private static final Scanner sc = new Scanner(System.in);

    static void questionario() {
        String nome;
        do {
            System.out.print("Entre com o seu nome: ");
            nome = sc.nextLine();
            if (nome.length() < 3) {
                System.out.println("Nome inválido! Deve ter pelo menos 3 caracteres.");
            }
        } while (nome.length() < 3);

        char sexo;
        do {
            System.out.print("Entre com seu sexo (m/f): ");
            String entrada = sc.nextLine();
            sexo = (entrada.isEmpty()) ? ' ' : entrada.charAt(0);
            if (sexo != 'm' && sexo != 'f') {
                System.out.println("Sexo inválido! Digite 'm' ou 'f'.");
            }
        } while (sexo != 'm' && sexo != 'f');

        int idade;
        do {
            System.out.print("Entre com a sua idade (0 a 150): ");
            while (!sc.hasNextInt()) {
                System.out.println("Idade inválida! Digite um número.");
                sc.next();
                        }
            idade = sc.nextInt();
            sc.nextLine();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade fora do intervalo permitido!");
            }
        } while (idade < 0 || idade > 150);

        char estado;
        do {
            System.out.print("Entre com o seu estado civil (s, c, v, d): ");
            String entrada = sc.nextLine();
            estado = (entrada.isEmpty()) ? ' ' : entrada.charAt(0);
            if (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd') {
                System.out.println("Estado civil inválido!");
            }
        } while (estado != 's' && estado != 'c' && estado != 'v' && estado != 'd');

        double salario;
        do {
            System.out.print("Entre com o seu salário: ");
            while (!sc.hasNextDouble()) {
                System.out.println("Salário inválido! Digite um número.");
                sc.next();              }
            salario = sc.nextDouble();
            sc.nextLine(); 
            if (salario < 0) {
                System.out.println("Salário não pode ser negativo!");
            }
        } while (salario < 0);

        System.out.println("\nv Dados cadastrados com sucesso!");
        System.out.printf("Nome: %s\nSexo: %c\nIdade: %d\nEstado civil: %c\nSalário: %.2f\n",
                nome, sexo, idade, estado, salario);
    }

    public static void main(String[] args) {
        questionario();
    }
}
