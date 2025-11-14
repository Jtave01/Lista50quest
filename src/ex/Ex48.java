package ex;

import java.util.Scanner;

public class Ex48 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a sequencia numerica");

        int num = sc.nextInt();
        
        int [] numArr = String.valueOf(num).chars().map(Character::getNumericValue).toArray();


        for(int i = numArr.length - 1; i >= 0; i --){
            System.out.print(numArr[i]);
        }
    }    
}
