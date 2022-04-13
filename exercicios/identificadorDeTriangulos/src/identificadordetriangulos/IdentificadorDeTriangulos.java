package identificadordetriangulos;

import java.util.Scanner;

public class IdentificadorDeTriangulos {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        double x1, x2, x3;
       
        System.out.print("Digite o 1º lado do triângulo: ");
        x1 = input.nextDouble();
    
        System.out.print("Digite o 2º lado do triângulo: ");
        x2 = input.nextDouble();
    
        System.out.print("Digite o 3º lado do triângulo: ");
        x3 = input.nextDouble();
        
        System.out.print("O triângulo digitado é ");
        if (x1 == x2 && x1 == x3)
            System.out.println("EQUILÁTERO.");
        else if (x1 != x2 && x2 != x3 && x1 != x3)
            System.out.println("ESCALENO.");
        else
            System.out.println("ISÓSCELES.");
    }
}
