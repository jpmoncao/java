/*
    Exercício 9: Faça um programa que calcule a tabuada dos números de 1 a 10 auto-
    maticamente
 */
package tabuada1a10;

public class Tabuada1a10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int c = 0; c <= 10; c++) {
                if (c != 10)
                    System.out.println(i +" x "+ c +"  = "+(i * c));
                else
                    System.out.println(i +" x "+ c +" = "+(i * c));
            }
            System.out.println("--------------");
        }
    }
    
}
