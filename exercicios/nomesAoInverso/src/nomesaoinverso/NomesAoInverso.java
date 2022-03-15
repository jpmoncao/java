package nomesaoinverso;

import java.util.Scanner;

public class NomesAoInverso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String n1, n2, n3;
        
        System.out.print("Digite o 1° nome: ");
        n1 = input.next();
        
        System.out.print("Digite o 2° nome: ");
        n2 = input.next();
        
        System.out.print("Digite o 3° nome: ");
        n3 = input.next();
        
        System.out.println("Os nomes inseridos foram: {"+n1+", "+n2+" e "+n3+"}.");
        System.out.println("A ordem inversa dos nomes é: "+n3+", "+n2+" e "+n1+".");
    }
    
}
