package ordemcrescente;

import java.util.Scanner;

public class OrdemCrescente {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o 1º número: ");
        int n1 = ler.nextInt();
        
        System.out.println("Digite o 2º número: ");
        int n2 = ler.nextInt();
        
        System.out.println("Digite o 3º número: ");
        int n3 = ler.nextInt();

        /**/
        int menor = n1;
        if (menor > n2) {
            menor = n2;
        }
        
        if (menor > n3) {
            menor = n3;
        }
        
        /**/
        int maior = n1;
        if (maior < n2) {
            maior = n2;
        }
        
        if (maior < n3) {
            maior = n3;
        }
        
        /**/
        int meio = n1;
        if (maior == n1 && menor == n3) {
            meio = n2;
        }
        
        if (maior == n1 && menor == n2) {
            meio = n3;
        }
        
        if (maior == n2 && menor == n3) {
            meio = n1;
        }

        
        System.out.println("A ordem crescente é: "+menor+", "+meio+" e "+maior+".");
        
    }
    
}
