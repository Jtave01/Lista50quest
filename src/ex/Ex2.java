package ex;

import java.util.Scanner;

public class Ex2 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println(" =======Login=======");
        System.out.println("Digite seu nome de usuario ");
        String nome = sc.nextLine();

        System.out.println("Entre com a senha ");
        String senha = sc.nextLine();

        while ((nome.equals(senha))) {
            System.out.println("A senha nao pode ser igual"
            + " ao nome de usuario");

             System.out.println("Entre com a senha ");
             senha = sc.nextLine();
        }
        

    }
}
