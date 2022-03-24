import java.util.Scanner;

public class Main3c {
    public static void main(String[] args) {
        int valores;
        for(int i=0;i<4;i++) {
            System.out.println("Digite o valor " + i);
            Scanner scannmr = new Scanner(System.in);
            valores = scannmr.nextInt();
            if (valores > 0) {
                System.out.println("O valor é positivo");
            } else if(valores < 0) {
                System.out.println("O valor é negativo");
            } else {
                System.out.println("O valor é zero");
            }
            if (i==3) {
                scannmr.close();
            }
        }
    }
}
