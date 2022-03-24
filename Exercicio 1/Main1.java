import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Digite o preço pago: ");
        Scanner scan = new Scanner(System.in);
        int pago = scan.nextInt();
       
        System.out.println("Digite o preço do produto: ");
        Scanner scan2 = new Scanner(System.in);
        int preco = scan2.nextInt();
        
        System.out.println("Troco: " + (pago-preco));
        scan.close();
        scan2.close();
    }
}