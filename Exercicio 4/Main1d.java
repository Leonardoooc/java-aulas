import java.util.Scanner;

public class Main1d {
    public static void main(String[] args) {
        System.out.println("Digite o valor :");
        Scanner scannmr = new Scanner(System.in);
        double numero = scannmr.nextDouble();

        double valor = nmr(numero);
        System.out.println(valor);
        scannmr.close();
    }
    public static double nmr(double numero) {
        numero = Math.pow(numero, 3);
        return numero;
    }
}
