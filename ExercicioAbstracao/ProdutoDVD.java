import java.util.Scanner;

public class ProdutoDVD extends Produto {
    public ProdutoDVD(String nome, float preco) {
        super(nome, preco);
    }
    public ProdutoDVD() {
    }
    public void produto() {
        System.out.println("Digite o nome do DVD: ");
        Scanner scannome = new Scanner(System.in);
        String nome = scannome.nextLine();

        System.out.println("Digite o preço do DVD: ");
        Scanner scanpreco = new Scanner(System.in);
        float preco = scanpreco.nextFloat();

        System.out.println("Digite a duracao do DVD: ");
        Scanner scanduracao = new Scanner(System.in);
        int duracao = scanduracao.nextInt();

        setDuracao(duracao);
        setPreco(preco);
        setNome(nome);
    }
    
}
