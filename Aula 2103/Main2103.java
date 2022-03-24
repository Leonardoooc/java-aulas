import java.util.Date;
import java.util.Scanner;

public class Main2103 {
    public static void main(String[] args) {
        Empresa1 emp1 = new Empresa1();
        Conta conta = new Conta();
        emp1.setNome("Empresa teste");
        emp1.setCnpj("1234567890");
        emp1.setDataFundacao(new Date());
        emp1.setEndereco("Rua teste 534");
        emp1.setFaturamento(500000);

        //emp1.showContents();
       //int n = 1;
        Scanner scanopcao = new Scanner(System.in);

        //while (n>0) {

        
            System.out.println("\nDigite a opção: ");
            System.out.println("[1] Sacar");
            System.out.println("[2] Depositar");
            System.out.println("[3] Verificar Saldo");
            System.out.println("[4] Para sair");
            int opcao = scanopcao.nextInt();
            switch(opcao) {
                case 1:
                    conta.Sacar();
                    break;
                case 2:
                    conta.Depositar();
                    break;
                case 3:
                    conta.Verificar();
                    break;
                /*case 4:
                    n = 0;
                    break;*/
                default:
                    System.out.println("opção inválida");
                    break;
            }
        //}
        scanopcao.close();
    }
}
