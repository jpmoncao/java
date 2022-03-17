package conversorcelsius;

import java.util.Scanner;

public class ConversorCelsius {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double c, f;
        
        System.out.print("Digite uma temperatura em Fahrenheit(°F): ");
        f = input.nextDouble();
        c = 5 * ((f - 32) / 9);
        
        System.out.println(f+"°F é = "+c+"°C.");
        
    }
    
}
