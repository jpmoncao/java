package areatriangulo;

import java.util.Scanner;

public class AreaTriangulo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base, alt, area;
        
        System.out.print("Digite a base do triângulo: ");
        base = input.nextDouble();
        
        System.out.print("Digite a altura do triângulo: ");
        alt = input.nextDouble();
        
        area = (base * alt) / 2;
        System.out.print("A área do triângulo é = "+area+".");
    }
    
}