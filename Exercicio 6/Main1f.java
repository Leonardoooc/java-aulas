import java.util.Scanner;

public class Main1f {
    public static void main(String[] args) {
        int matriz[][] = new int[3][2];

        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) {
                System.out.printf("Digite o valor [%d][%d] da matriz ", i, j);
                Scanner scannmr = new Scanner(System.in);  
                int nmr = scannmr.nextInt();
                matriz[i][j] = nmr;
                if (nmr < 0) {
                    matriz[i][j] = 0;
                }
                if (i==2 && j==1) {
                    scannmr.close();
                }
            }
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<2;j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }
    }
}
