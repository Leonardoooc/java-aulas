import java.util.Scanner;

public class Main2c {
    public static void main(String[] args) {
        int valores[] = new int[5];
        for(int i=0;i<5;i++) {
            System.out.println("Digite o valor " + i);
            Scanner scannmr = new Scanner(System.in);
            valores[i] = scannmr.nextInt();
            if (i==4) {
                scannmr.close();
            }
        }
        int total = valores[0]*valores[1]*valores[2]*valores[3]*valores[4];
        System.out.println(total);
    }
}