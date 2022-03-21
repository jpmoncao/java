package mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        double media;
        
        System.out.print("Digite o primeiro número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o segundo número: ");
        n2 = input.nextInt();
        
        System.out.println("O resultado de '"+n1+" x 2' é "+(n1 * 2)+".");
        System.out.println("O resultado de '"+n2+" x 6' é "+(n2 * 6)+".");
        
        media = (n1 * 2) + (n2 * 6);
        System.out.println("O resultado da média aritmética dos cálculos é: "+media+".");
    }
    
}
