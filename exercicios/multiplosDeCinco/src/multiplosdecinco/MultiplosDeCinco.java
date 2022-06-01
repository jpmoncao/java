/*
(for) EXERCÍCIO 1: Escreva um programa que imprima todos os números múltiplos de 5, no intervalo fechado de 1 a 500.
*/

package multiplosdecinco;

public class MultiplosDeCinco {

    public static void main(String[] args) {
        for (int c = 1; c <= 500; c ++) {
            if (c % 5 == 0) {
                System.out.println(c);
            }
        }
    }
    
}
