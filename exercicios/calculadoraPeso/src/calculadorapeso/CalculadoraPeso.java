/*
(WHILE) Exercício 2: Faça um programa que receba o peso da pessoa, calcule e 
mostre:
        a) o novo peso se a pessoa engordar 15% sobre o peso digitado.
        b) o novo peso se a pessoa emagrecer 20% sobre o peso.
    O programa deverá receber os dados até que o peso seja menor que zero.
 */
package calculadorapeso;

import java.util.Scanner;

public class CalculadoraPeso {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("---RESOLUÇÃO WHILE---");
        double peso = 0;
        
        while(peso >= 0) {
            System.out.print("Digite seu peso(kg): ");
            peso = input.nextDouble();
            if (peso >= 0) { // Verificação de número negativo 
                System.out.println("Caso engordar 15% sobre seu peso atual ele passará de "+peso+"kg para -> "+ ((peso * 15/100)+ peso)+ "kg.");
                System.out.println("Caso emagrecer 20% sobre seu peso atual ele passará de "+peso+"kg para -> "+ (peso - (peso * 20/100)) + "kg.");
                System.out.println("----------");
            }
        }
        
        System.out.println("\n---RESOLUÇÃO DO/WHILE---");
        
        do {
            System.out.print("Digite seu peso(kg): ");
            peso = input.nextDouble();
            
            System.out.println("Caso engordar 15% sobre seu peso atual ele passará de "+peso+"kg para -> "+ ((peso * 15/100)+ peso)+ "kg.");
            System.out.println("Caso emagrecer 20% sobre seu peso atual ele passará de "+peso+"kg para -> "+ (peso - (peso * 20/100)) + "kg.");
            System.out.println("----------");
        } while(peso >= 0);
    }

}
