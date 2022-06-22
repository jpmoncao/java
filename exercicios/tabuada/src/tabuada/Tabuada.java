/*
    Exercício 8: Faça um programa que calcule a tabuada de um número digitado pelo 
    usuário
 */
package tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        for (int c = 0; c <= 10; c++) {
            if (c != 10)
                System.out.println(num +" x "+ c +"  = "+(num * c));
            else
                System.out.println(num +" x "+ c +" = "+(num * c));
        }
    }
    
}
