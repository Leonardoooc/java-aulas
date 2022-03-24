import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Digite o valor de A");
        Scanner scanA = new Scanner(System.in);
        int a = scanA.nextInt();

        System.out.println("Digite o valor de B");
        Scanner scanB = new Scanner(System.in);
        int b = scanB.nextInt();

        int cache;
        cache = a;
        a = b;
        b = cache;

        System.out.printf("Valor de A = %d, Valor de B = %d", a, b);
        scanA.close();
        scanB.close();
    }
}
