import java.util.Scanner;

public class Main1c {
    public static void main(String[] args) {
        System.out.println("Digite o primeiro termo da progressão aritmética:");
        Scanner scantermo = new Scanner(System.in);
        int termo = scantermo.nextInt();

        System.out.println("Digite a razão da progressão aritmética:");
        Scanner scanrazao = new Scanner(System.in);
        int razao = scanrazao.nextInt();

        int an = termo;
        int n = 0;
        System.out.println("");
        while(n<=9){ 
            System.out.println(an); 
            an += razao;
            n++; 
        }
        scanrazao.close();
        scantermo.close();
    }
}
