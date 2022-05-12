/*
Exercício 1: Switch case
    - Faça um algoritmo que simule uma calculadora que ao ler dois números e o tipo de cálculo, imprima o resultado
      da operação (1 - soma, 2 - subtração, 3 - divisão e 4- multiplicação)
 */

package calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String row = "-------------------------------";
        
        System.out.println(row);
        System.out.println("BEM VINDO A CALCULADORA EM JAVA!");
        System.out.println(row);
        
        System.out.print("Digite o 1º número: ");
        double n1 = input.nextDouble();
        
        System.out.print("Digite o 2º número: ");
        double n2 = input.nextDouble();
        
        System.out.println(row);
        
        System.out.println("Escolha agora uma operação:");
        System.out.println("    1) Soma");
        System.out.println("    2) Subtração");
        System.out.println("    3) Divisão");
        System.out.println("    4) Multiplicação");
        
        System.out.print("\n>>> ");
        int opc = input.nextInt();
        System.out.println(row);
        
        switch (opc) {
            case 1:
                System.out.println(n1+" + "+n2+" = "+ (n1+n2));
                break;
            case 2:
                System.out.println(n1+" - "+n2+" = "+ (n1-n2));
                break;
                
            case 4:
                System.out.println(n1+" x "+n2+" = "+ (n1*n2));
                break;
                
            case 3:
                System.out.println(n1+" ÷ "+n2+" = "+ (n1/n2));
                break;
            
            default:
                System.out.println("ERRO: O número "+opc+" não corresponde a nenhuma opção!");
        }
    }
    
}
