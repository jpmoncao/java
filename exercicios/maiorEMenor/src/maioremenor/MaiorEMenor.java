package maioremenor;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Digite o 1º número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o 2º número: ");
        n2 = input.nextInt();
        
        if (n1 > n2) 
            System.out.println("Entre os dois números o 1º é maior que o 2º.");
        
        else if (n2 > n1) 
            System.out.println("Entre os dois números o 2º é maior que o 1º.");
        
        else
            System.out.println("Os dois números são iguais.");
    }
    
}
