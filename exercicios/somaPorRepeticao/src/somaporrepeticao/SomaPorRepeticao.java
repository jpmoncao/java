/*
(WHILE) Exercício 1: Faça um programa que receba números enquanto for diferente
de zero. Esses números deverão ser somados e ao final imprimir o resultado.
 */
package somaporrepeticao;

import java.util.Scanner;

public class SomaPorRepeticao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("---RESOLUÇÃO WHILE---");
        int soma = 0;
        int n = -1;
        
        while(n != 0) {
            System.out.print("Digite um número (0 p/concluir): ");
            n = input.nextInt();
            soma += n;
        }
        System.out.println(soma);
        
        System.out.println("\n---RESOLUÇÃO DO/WHILE---");
        soma = 0;
        
        do{
            System.out.print("Digite um número (0 p/concluir): ");
            n = input.nextInt();
            soma += n;
         } while(n != 0);
        
        System.out.println(soma);
    }

}
