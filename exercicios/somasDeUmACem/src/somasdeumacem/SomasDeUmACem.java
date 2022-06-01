/*
(for) EXERCÍCIO 2: Criar um programa que imprima todos os números de 1 até 100, inclusive, e a soma de todos eles
 */
package somasdeumacem;

public class SomasDeUmACem {

    public static void main(String[] args) {
        int soma = 0;
        
        for (int c = 1; c <= 100; c++) {
            System.out.println(c+" + "+c+" = "+(c + c));
            soma += c;
        }
        System.out.println("A soma de todos os números é igual a "+soma+".");
    }
    
}
