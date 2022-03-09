package multiplicarnumero;

import java.util.Scanner;

public class MultiplicarNumero {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.print("Digite o 1° número: ");
        n1 = input.nextInt();
        
        System.out.print("Digite o 2° número: ");
        n2 = input.nextInt();
        
        System.out.println("O resultado da multiplicação entre "+n1+" e "+n2+" = "+n1*n2+".");
    }
    
}
