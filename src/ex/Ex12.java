package ex;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Entre com o n umero ");
        int num = sc.nextInt();
        System.out.println("Tabuada do: " + num);
        for(int i = 0; i <= 10; i++){
            
            System.out.println(i + "x" + num + "=" + (i*num));
        }
    }
}
