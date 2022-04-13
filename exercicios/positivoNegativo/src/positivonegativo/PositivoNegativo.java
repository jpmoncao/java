package positivonegativo;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = input.nextInt();
        
        System.out.print("O número digitado é ");
        if (n > 0)
            System.out.println("positivo.");
        else if (n < 0)
            System.out.println("negativo.");
        else if (n == 0)
            System.out.println("igual a 0.");
    }
    
}
