import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner scan = new Scanner(System.in);
        int nmr = scan.nextInt();
        scan.close();
        System.out.printf("%d %d %d %d %d",nmr-2, nmr-1, nmr, nmr+1, nmr+2);
    }
}