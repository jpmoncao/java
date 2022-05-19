package numeroparimpar;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = ler.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Seu número é PAR!");
        } else {
            System.out.println("Seu número é ÍMPAR!");
        }
    }
    
}
