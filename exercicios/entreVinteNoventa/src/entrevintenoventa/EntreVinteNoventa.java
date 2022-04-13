package entrevintenoventa;

import java.util.Scanner;

public class EntreVinteNoventa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        if(n >= 20 && n <= 90) 
            System.out.println("O número está entre a faixa de 20 a 90.");
        else
            System.out.println("Número fora da faixa de 20 a 90.");
    }
    
}
