/*
(for) EXERCÍCIO 4: Escreva um programa que receba dez números do usuário e imprima a metade de cade número.
 */
package metadedosnumeros;

import java.util.Scanner;

public class MetadeDosNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int c = 1; c <= 10; c++) {
            System.out.print("Digite o "+c+"º número: ");
            double n = input.nextInt();
            System.out.println("Sua metade é: "+n/2);
        }
    }
    
}
