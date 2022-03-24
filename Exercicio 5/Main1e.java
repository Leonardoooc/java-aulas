import java.util.Scanner;

public class Main1e {
    public static void main(String[] args) {
        double valores[] = new double[5];
        for(int i=0;i<5;i++) {
            System.out.println("Digite o peso da pessoa " + i);
            Scanner scannmr = new Scanner(System.in);
            valores[i] = scannmr.nextDouble();
            if (i==4) {
                scannmr.close();
            }
        }
        System.out.printf("Média de peso: %.2f", (valores[0]+valores[1]+valores[2]+valores[3]+valores[4])/5);
    }
}
