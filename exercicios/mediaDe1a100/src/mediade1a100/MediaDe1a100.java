package mediade1a100;

public class MediaDe1a100 {

    public static void main(String[] args) {
        double soma = 0;
        for (int c = 1; c <= 100; c++) {
            soma += c;
        }
        System.out.println("A média será: " + (soma / 100));
    }

}
