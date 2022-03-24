import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("Digite o nome do vendedor:");
        Scanner scannome = new Scanner(System.in);
        String nome = scannome.nextLine();

        System.out.println("Digite o salário do vendedor:");
        Scanner scansalario = new Scanner(System.in);
        int salario = scansalario.nextInt();

        System.out.println("Digite o total de vendas do vendedor em reais:");
        Scanner scanvendas = new Scanner(System.in);
        double vendas = scanvendas.nextDouble();
        
        double total = salario + (vendas*0.15);
        System.out.printf("Salário fixo do %s: %d, Salário final com bônus de vendas: %.2f", nome, salario, total);

        scannome.close();
        scanvendas.close();
        scansalario.close();
    }
}
